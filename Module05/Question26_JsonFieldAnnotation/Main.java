import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.StringJoiner;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class Customer {
    @JsonField(name = "customer_id")
    private int id;

    @JsonField(name = "full_name")
    private String name;

    @JsonField(name = "email_address")
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

public class Main {
    public static String toJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        StringJoiner joiner = new StringJoiner(", ", "{", "}");

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                Object val = field.get(obj);
                if (val instanceof String) {
                    joiner.add("\"" + jsonField.name() + "\": \"" + val + "\"");
                } else {
                    joiner.add("\"" + jsonField.name() + "\": " + val);
                }
            }
        }
        return joiner.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer(101, "Rudra Rana", "rudra@example.com");
        String json = toJson(customer);
        System.out.println("Serialized JSON:");
        System.out.println(json);
    }
}
