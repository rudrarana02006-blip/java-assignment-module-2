import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static <T> void printCollection(Collection<T> collection) {
        for (T item : collection) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Queue<Double> queue = new LinkedList<>(Arrays.asList(1.1, 2.2, 3.3));

        System.out.print("List: ");
        printCollection(list);
        System.out.print("Set: ");
        printCollection(set);
        System.out.print("Queue: ");
        printCollection(queue);
    }
}
