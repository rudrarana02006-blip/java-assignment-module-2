public class Main {
    public static void main(String[] args) {
        Thread autoSaveThread = new Thread(() -> {
            while (true) {
                System.out.println("Auto-Save in progress...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        System.out.println("Main thread started file processing task...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Processing file chunk " + i + "...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("File processing completed. Main thread exiting.");
    }
}
