class ReverseStringRunnable implements Runnable {
    private String text;

    public ReverseStringRunnable(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.println(text.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ReverseStringRunnable task = new ReverseStringRunnable("MULTITHREADING");
        Thread thread = new Thread(task);
        thread.start();
    }
}
