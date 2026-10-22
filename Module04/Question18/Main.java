import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1001, "John");
        employees.put(1002, "Sarah");
        employees.put(1003, "Michael");

        System.out.println("Contains key 1002: " + employees.containsKey(1002));
        System.out.println("Contains key 1005: " + employees.containsKey(1005));

        System.out.println("Iterating using keySet:");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Name: " + employees.get(id));
        }

        System.out.println("Iterating using entrySet:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
