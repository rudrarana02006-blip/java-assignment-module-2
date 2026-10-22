import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface SecurityPolicy {
    String[] allowedRoles();
    int[] requiredSecurityLevels();
}

@SecurityPolicy(
    allowedRoles = {"ADMIN", "SUPERUSER", "OPERATOR"},
    requiredSecurityLevels = {1, 3, 5}
)
class FinancialRecord {
}

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = FinancialRecord.class;
        if (clazz.isAnnotationPresent(SecurityPolicy.class)) {
            SecurityPolicy policy = clazz.getAnnotation(SecurityPolicy.class);
            System.out.println("Allowed Roles: " + Arrays.toString(policy.allowedRoles()));
            System.out.println("Security Levels: " + Arrays.toString(policy.requiredSecurityLevels()));
        }
    }
}
