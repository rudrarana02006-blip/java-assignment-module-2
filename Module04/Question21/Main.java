import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.offer("Customer-1");
        ticketQueue.offer("Customer-2");
        ticketQueue.offer("Customer-3");
        ticketQueue.offer("Customer-4");

        System.out.println("Initial Queue: " + ticketQueue);

        while (!ticketQueue.isEmpty()) {
            String servedCustomer = ticketQueue.poll();
            System.out.println("Ticket booked for: " + servedCustomer + ". Remaining queue: " + ticketQueue);
        }
    }
}
