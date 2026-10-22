import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Middle");
        deque.addFirst("Front");
        deque.addLast("Back");
        System.out.println("Deque after adding at both ends: " + deque);

        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("Remaining Deque: " + deque);
    }
}
