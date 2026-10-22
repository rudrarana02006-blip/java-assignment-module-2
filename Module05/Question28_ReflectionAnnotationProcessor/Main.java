import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface AutoRun {
    int priority() default 1;
}

class TestSuite {
    @AutoRun(priority = 3)
    public void stepThree() {
        System.out.println("Executed Step 3 (Clean up)");
    }

    @AutoRun(priority = 1)
    public void stepOne() {
        System.out.println("Executed Step 1 (Initialize)");
    }

    @AutoRun(priority = 2)
    public void stepTwo() {
        System.out.println("Executed Step 2 (Process Data)");
    }

    public void regularMethod() {
        System.out.println("Ignored regular method");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        TestSuite suite = new TestSuite();
        List<Method> annotatedMethods = new ArrayList<>();

        for (Method method : TestSuite.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(AutoRun.class)) {
                annotatedMethods.add(method);
            }
        }

        annotatedMethods.sort(Comparator.comparingInt(m -> m.getAnnotation(AutoRun.class).priority()));

        System.out.println("Invoking methods dynamically based on @AutoRun priority:");
        for (Method m : annotatedMethods) {
            m.invoke(suite);
        }
    }
}
