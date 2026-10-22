import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(30);
        pq1.add(10);
        pq1.add(50);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(40);
        pq2.add(20);
        pq2.add(60);

        PriorityQueue<Integer> mergedPq = new PriorityQueue<>(pq1);
        mergedPq.addAll(pq2);

        System.out.println("Merged PriorityQueue: " + mergedPq);

        List<Integer> sortedList = new ArrayList<>();
        while (!mergedPq.isEmpty()) {
            sortedList.add(mergedPq.poll());
        }

        System.out.println("Resulting sorted order: " + sortedList);
    }
}
