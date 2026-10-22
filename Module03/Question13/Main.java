import java.util.concurrent.locks.ReentrantLock;

class UnsafeCounter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class SafeCounter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UnsafeCounter unsafeCounter = new UnsafeCounter();
        SafeCounter safeCounter = new SafeCounter();

        Thread[] unsafeThreads = new Thread[10];
        Thread[] safeThreads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            unsafeThreads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    unsafeCounter.increment();
                }
            });
            safeThreads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    safeCounter.increment();
                }
            });
            unsafeThreads[i].start();
            safeThreads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            unsafeThreads[i].join();
            safeThreads[i].join();
        }

        System.out.println("Expected count: 10000");
        System.out.println("Unsafe counter count (without lock): " + unsafeCounter.getCount());
        System.out.println("Safe counter count (with ReentrantLock): " + safeCounter.getCount());
    }
}
