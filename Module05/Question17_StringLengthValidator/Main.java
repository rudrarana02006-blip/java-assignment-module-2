import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface StringLength {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}

class UserProfile {
    @StringLength(min = 3, max = 10)
    private String username;

    public UserProfile(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Main {
    public static boolean validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(StringLength.class)) {
                field.setAccessible(true);
                String value = (String) field.get(obj);
                StringLength length = field.getAnnotation(StringLength.class);
                if (value == null || value.length() < length.min() || value.length() > length.max()) {
                    System.out.println("Validation failed for field '" + field.getName() + "': '" + value + "' (Length must be between " + length.min() + " and " + length.max() + ")");
                    return false;
                }
            }
        }
        System.out.println("Validation passed!");
        return true;
    }

    public static void main(String[] args) throws IllegalAccessException {
        UserProfile validUser = new UserProfile("Rudra");
        UserProfile invalidUser = new UserProfile("Al");
        UserProfile tooLongUser = new UserProfile("VeryLongUsernameExceedingLimit");

        System.out.println("Validating 'Rudra':");
        validate(validUser);

        System.out.println("\nValidating 'Al':");
        validate(invalidUser);

        System.out.println("\nValidating 'VeryLongUsernameExceedingLimit':");
        validate(tooLongUser);
    }
}
