import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) numbers.add(i);

        System.out.println("Original sorted list: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("After Collections.shuffle(): " + numbers);

        Collections.sort(numbers);
        System.out.println("After Collections.sort(): " + numbers);
    }
}
