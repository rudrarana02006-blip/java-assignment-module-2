import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    public static void safeAcquire(String threadName, ReentrantLock first, ReentrantLock second) {
        while (true) {
            try {
                if (first.tryLock(300, TimeUnit.MILLISECONDS)) {
                    System.out.println(threadName + " acquired first lock");
                    try {
                        Thread.sleep(50);
                        if (second.tryLock(300, TimeUnit.MILLISECONDS)) {
                            try {
                                System.out.println(threadName + " acquired second lock - Executing task");
                                return;
                            } finally {
                                second.unlock();
                            }
                        } else {
                            System.out.println(threadName + " timed out waiting for second lock. Releasing first and retrying...");
                        }
                    } finally {
                        first.unlock();
                    }
                }
                Thread.sleep((long) (Math.random() * 200 + 50));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> safeAcquire("Thread-1", lock1, lock2));
        Thread t2 = new Thread(() -> safeAcquire("Thread-2", lock2, lock1));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Both threads completed successfully without deadlock.");
    }
}
