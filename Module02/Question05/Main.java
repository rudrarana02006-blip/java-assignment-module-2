import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Banana");
        names.add("Apple");
        names.add("Mango");
        names.add("Orange");
        names.add("Grapes");

        System.out.println("Before sorting: " + names);

        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));

        System.out.println("After sorting (descending): " + names);
    }
}
