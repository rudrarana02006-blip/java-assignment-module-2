public class Main {
    private static volatile boolean running = true;

    public static void main(String[] args) {
        Thread countdownThread = new Thread(() -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            running = false;
        });

        Thread tickThread = new Thread(() -> {
            while (running) {
                System.out.println("Tick");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        countdownThread.start();
        tickThread.start();
    }
}
