class SleeperThread extends Thread {
    private String message;
    private int delay;
    private int count;

    public SleeperThread(String message, int delay, int count) {
        this.message = message;
        this.delay = delay;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SleeperThread t1 = new SleeperThread("Thread 1", 1000, 4);
        SleeperThread t2 = new SleeperThread("Thread 2", 2000, 2);
        t1.start();
        t2.start();
    }
}
