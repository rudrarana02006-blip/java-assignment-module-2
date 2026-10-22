@FunctionalInterface
interface Calculator {
    int compute(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + addition.compute(a, b));
        System.out.println("Subtraction: " + subtraction.compute(a, b));
        System.out.println("Multiplication: " + multiplication.compute(a, b));
    }
}
