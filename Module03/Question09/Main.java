class Chopstick {
    private String name;

    public Chopstick(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Chopstick c1 = new Chopstick("Chopstick-1");
        Chopstick c2 = new Chopstick("Chopstick-2");

        Thread philosopher1 = new Thread(() -> {
            synchronized (c1) {
                System.out.println("Philosopher 1 acquired " + c1.getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Philosopher 1 waiting for " + c2.getName());
                synchronized (c2) {
                    System.out.println("Philosopher 1 acquired " + c2.getName());
                }
            }
        });

        Thread philosopher2 = new Thread(() -> {
            synchronized (c2) {
                System.out.println("Philosopher 2 acquired " + c2.getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Philosopher 2 waiting for " + c1.getName());
                synchronized (c1) {
                    System.out.println("Philosopher 2 acquired " + c1.getName());
                }
            }
        });

        philosopher1.start();
        philosopher2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Deadlock occurred: both philosophers are waiting on each other's chopsticks.");
        System.exit(0);
    }
}
