import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(103, "Charlie");
        treeMap.put(101, "Alice");
        treeMap.put(104, "David");
        treeMap.put(102, "Bob");

        System.out.println("TreeMap sorted by keys:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
