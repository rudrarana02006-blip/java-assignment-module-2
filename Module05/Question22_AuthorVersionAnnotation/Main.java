import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ClassInfo {
    String author();
    String version() default "1.0";
}

@ClassInfo(author = "Rudra Rana", version = "2.5")
class OrderService {
}

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = OrderService.class;
        if (clazz.isAnnotationPresent(ClassInfo.class)) {
            ClassInfo info = clazz.getAnnotation(ClassInfo.class);
            System.out.println("Class: " + clazz.getSimpleName());
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
        }
    }
}
