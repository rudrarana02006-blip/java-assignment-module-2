import java.util.function.Function;

public class Main {
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = Main::square;

        int number = 7;
        int result = squareFunction.apply(number);

        System.out.println("Square of " + number + " is: " + result);
    }
}
