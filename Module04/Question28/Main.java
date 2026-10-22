import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Iterating and concurrently modifying ConcurrentHashMap:");
        for (String key : map.keySet()) {
            System.out.println("Read key: " + key + " = " + map.get(key));
            if (key.equals("B")) {
                map.put("D", 4);
                System.out.println("Inserted key 'D' while iterating.");
            }
        }

        System.out.println("Final ConcurrentHashMap entries: " + map);
    }
}
