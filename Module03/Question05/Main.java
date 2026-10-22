class WorkerThread extends Thread {
    public WorkerThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Running: " + getName() + " | Priority: " + getPriority());
    }
}

public class Main {
    public static void main(String[] args) {
        WorkerThread w1 = new WorkerThread("Worker-1", Thread.MIN_PRIORITY);
        WorkerThread w2 = new WorkerThread("Worker-2", Thread.NORM_PRIORITY);
        WorkerThread w3 = new WorkerThread("Worker-3", Thread.MAX_PRIORITY);

        w1.start();
        w2.start();
        w3.start();
    }
}
