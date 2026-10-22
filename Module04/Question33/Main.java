import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "orange", "apple", "banana", "apple", "banana");

        System.out.println("Items list: " + items);
        System.out.println("Frequency of 'apple': " + Collections.frequency(items, "apple"));
        System.out.println("Frequency of 'banana': " + Collections.frequency(items, "banana"));
        System.out.println("Frequency of 'orange': " + Collections.frequency(items, "orange"));
        System.out.println("Frequency of 'grape': " + Collections.frequency(items, "grape"));
    }
}
