import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        System.out.println("Iterating through CopyOnWriteArrayList while adding elements:");
        for (String item : list) {
            System.out.println("Read: " + item);
            if (item.equals("Beta")) {
                list.add("Delta");
                System.out.println("Added 'Delta' during iteration.");
            }
        }

        System.out.println("List after iteration: " + list);
    }
}
