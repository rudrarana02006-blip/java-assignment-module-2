import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(3);
        list.add(42);
        list.add(27);
        list.add(8);

        Collections.sort(list);
        System.out.println("Sorted list for binary search: " + list);

        int target = 27;
        int index = Collections.binarySearch(list, target);
        System.out.println("Index of " + target + " is: " + index);

        int missing = 50;
        int missingIndex = Collections.binarySearch(list, missing);
        System.out.println("Search result for missing value " + missing + " is: " + missingIndex);
    }
}
