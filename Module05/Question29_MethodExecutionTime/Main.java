import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}

class ComputationalTask {
    @LogExecutionTime
    public void performHeavyWork() {
        long sum = 0;
        for (int i = 0; i < 50_000_000; i++) {
            sum += i;
        }
        System.out.println("Task finished computation with sum = " + sum);
    }
}

public class Main {
    public static void executeWithTimer(Object target, String methodName) throws Exception {
        Method method = target.getClass().getMethod(methodName);
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            long startTime = System.currentTimeMillis();
            method.invoke(target);
            long endTime = System.currentTimeMillis();
            System.out.println("Execution time for '" + methodName + "': " + (endTime - startTime) + " ms");
        } else {
            method.invoke(target);
        }
    }

    public static void main(String[] args) throws Exception {
        ComputationalTask task = new ComputationalTask();
        executeWithTimer(task, "performHeavyWork");
    }
}
