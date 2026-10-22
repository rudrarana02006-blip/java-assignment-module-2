class Inventory {
    private int stock = 10;

    public void reduceStock(String threadName, int quantity) {
        synchronized (this) {
            if (stock >= quantity) {
                System.out.println(threadName + " is reducing stock by " + quantity);
                stock -= quantity;
                System.out.println("Stock remaining: " + stock);
            } else {
                System.out.println(threadName + " cannot reduce stock by " + quantity + ". Current stock: " + stock);
            }
        }
    }
}

class OrderTask implements Runnable {
    private Inventory inventory;
    private String customerName;
    private int quantity;

    public OrderTask(Inventory inventory, String customerName, int quantity) {
        this.inventory = inventory;
        this.customerName = customerName;
        this.quantity = quantity;
    }

    @Override
    public void run() {
        inventory.reduceStock(customerName, quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Thread t1 = new Thread(new OrderTask(inventory, "Customer-1", 4));
        Thread t2 = new Thread(new OrderTask(inventory, "Customer-2", 4));
        Thread t3 = new Thread(new OrderTask(inventory, "Customer-3", 4));

        t1.start();
        t2.start();
        t3.start();
    }
}
