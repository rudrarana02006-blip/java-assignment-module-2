class FileDownloader extends Thread {
    private volatile boolean running = true;

    public void stopDownload() {
        running = false;
    }

    @Override
    public void run() {
        int chunk = 1;
        while (running) {
            System.out.println("Downloading chunk " + chunk + "...");
            chunk++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println("Download stopped gracefully.");
    }
}

public class Main {
    public static void main(String[] args) {
        FileDownloader downloader = new FileDownloader();
        downloader.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread requesting download stop...");
        downloader.stopDownload();
    }
}
