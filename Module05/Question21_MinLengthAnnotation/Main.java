import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MinLength {
    int value() default 5;
}

class Account {
    @MinLength(8)
    private String password;

    public Account(String password) {
        this.password = password;
    }
}

public class Main {
    public static void validateMinLength(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(MinLength.class)) {
                field.setAccessible(true);
                String value = (String) field.get(obj);
                MinLength minLength = field.getAnnotation(MinLength.class);
                if (value == null || value.length() < minLength.value()) {
                    System.out.println("Error: Field '" + field.getName() + "' must have minimum length of " + minLength.value() + " characters.");
                } else {
                    System.out.println("Success: Field '" + field.getName() + "' satisfies minimum length of " + minLength.value() + ".");
                }
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Account acc1 = new Account("secret123");
        Account acc2 = new Account("abc");

        System.out.println("Checking acc1 ('secret123'):");
        validateMinLength(acc1);

        System.out.println("\nChecking acc2 ('abc'):");
        validateMinLength(acc2);
    }
}
