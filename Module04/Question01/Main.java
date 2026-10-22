class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }

    public T getNumber() {
        return number;
    }
}

public class Main {
    public static void main(String[] args) {
        NumberBox<Integer> intBox = new NumberBox<>(42);
        NumberBox<Double> doubleBox = new NumberBox<>(3.14159);

        System.out.println("Integer value: " + intBox.getNumber());
        System.out.println("Double converted: " + doubleBox.doubleValue());
    }
}
