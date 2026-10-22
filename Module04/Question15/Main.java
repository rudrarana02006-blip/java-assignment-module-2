import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(70);
        numbers.add(20);
        numbers.add(90);

        System.out.println("TreeSet elements: " + numbers);
        System.out.println("Smallest element (first): " + numbers.first());
        System.out.println("Largest element (last): " + numbers.last());

        numbers.remove(40);
        System.out.println("After removing 40: " + numbers);
    }
}
