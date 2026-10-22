import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vector<Integer> vector = new Vector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) vector.add(i);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) vector.add(i);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Vector size after concurrent adds (expected 2000): " + vector.size());
    }
}
