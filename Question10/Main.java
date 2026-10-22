public class Main {
    public static long calculateFactorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative: " + n);
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        try {
            int num1 = 5;
            System.out.println("Factorial of " + num1 + " is: " + calculateFactorial(num1));

            int num2 = -3;
            System.out.println("Factorial of " + num2 + " is: " + calculateFactorial(num2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
