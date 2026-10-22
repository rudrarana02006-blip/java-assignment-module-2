import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        System.out.println("After adding elements: " + list);

        list.remove("Banana");
        System.out.println("After removing by value ('Banana'): " + list);

        list.remove(1);
        System.out.println("After removing at index 1: " + list);

        list.set(0, "Avocado");
        System.out.println("After replacing element at index 0 with 'Avocado': " + list);
    }
}
