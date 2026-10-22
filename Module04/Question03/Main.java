class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.addItem("Hello Generics");
        System.out.println("String Box contains: " + strBox.getItem());

        Box<Integer> intBox = new Box<>();
        intBox.addItem(12345);
        System.out.println("Integer Box contains: " + intBox.getItem());
    }
}
