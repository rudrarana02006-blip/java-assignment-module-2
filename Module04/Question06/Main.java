import java.util.Arrays;
import java.util.List;

class MinMaxFinder<T extends Comparable<T>> {
    public T findMin(List<T> list) {
        if (list == null || list.isEmpty()) return null;
        T min = list.get(0);
        for (T item : list) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }

    public T findMax(List<T> list) {
        if (list == null || list.isEmpty()) return null;
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

public class Main {
    public static void main(String[] args) {
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>();
        List<Integer> numbers = Arrays.asList(45, 12, 89, 3, 67);
        System.out.println("Min integer: " + intFinder.findMin(numbers));
        System.out.println("Max integer: " + intFinder.findMax(numbers));

        MinMaxFinder<String> strFinder = new MinMaxFinder<>();
        List<String> words = Arrays.asList("orange", "apple", "mango", "banana");
        System.out.println("Min string: " + strFinder.findMin(words));
        System.out.println("Max string: " + strFinder.findMax(words));
    }
}
