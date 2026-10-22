import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue elements: " + queue);
        System.out.println("Head element (peek): " + queue.peek());
        System.out.println("Removed head element (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
