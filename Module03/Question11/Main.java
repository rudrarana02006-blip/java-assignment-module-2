class NumberPrinter {
    private int counter = 1;
    private final int limit = 20;

    public synchronized void printOdd() {
        while (counter <= limit) {
            while (counter % 2 == 0 && counter <= limit) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (counter <= limit) {
                System.out.println("Odd: " + counter);
                counter++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (counter <= limit) {
            while (counter % 2 != 0 && counter <= limit) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (counter <= limit) {
                System.out.println("Even: " + counter);
                counter++;
                notify();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread oddThread = new Thread(() -> printer.printOdd());
        Thread evenThread = new Thread(() -> printer.printEven());

        oddThread.start();
        evenThread.start();
    }
}
