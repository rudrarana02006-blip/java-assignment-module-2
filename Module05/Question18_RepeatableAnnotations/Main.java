import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Roles {
    Role[] value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Roles.class)
@interface Role {
    String value();
}

@Role("ADMIN")
@Role("MANAGER")
@Role("AUDITOR")
class AdminDashboard {
}

public class Main {
    public static void main(String[] args) {
        Role[] roles = AdminDashboard.class.getAnnotationsByType(Role.class);
        System.out.println("Roles assigned to AdminDashboard:");
        for (Role role : roles) {
            System.out.println("- " + role.value());
        }
    }
}
