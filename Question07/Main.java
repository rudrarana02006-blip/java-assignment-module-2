public class Main {
    public static void divideTryCatch(int a, int b) {
        try {
            int result = a / b;
            System.out.println("try-catch result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("try-catch caught ArithmeticException: " + e.getMessage());
        }
    }

    public static void divideTryCatchFinally(int a, int b) {
        try {
            int result = a / b;
            System.out.println("try-catch-finally result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("try-catch-finally caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("finally block executed");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Demonstrating try-catch ---");
        divideTryCatch(10, 2);
        divideTryCatch(10, 0);

        System.out.println("\n--- Demonstrating try-catch-finally ---");
        divideTryCatchFinally(10, 2);
        divideTryCatchFinally(10, 0);
    }
}
