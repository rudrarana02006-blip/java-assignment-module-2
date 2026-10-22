import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int N = 50000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(0, i);
        long end = System.nanoTime();
        System.out.println("ArrayList add at beginning: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(0, i);
        end = System.nanoTime();
        System.out.println("LinkedList add at beginning: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.remove(arrayList.size() / 2);
        end = System.nanoTime();
        System.out.println("ArrayList remove from middle (1000 ops): " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.remove(linkedList.size() / 2);
        end = System.nanoTime();
        System.out.println("LinkedList remove from middle (1000 ops): " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        long sumArray = 0;
        for (int num : arrayList) sumArray += num;
        end = System.nanoTime();
        System.out.println("ArrayList iteration: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        long sumLinked = 0;
        for (int num : linkedList) sumLinked += num;
        end = System.nanoTime();
        System.out.println("LinkedList iteration: " + (end - start) / 1_000_000.0 + " ms");
    }
}
