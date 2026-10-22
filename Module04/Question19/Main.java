import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Zara", 88);
        scores.put("Alex", 95);
        scores.put("Brian", 78);
        scores.put("David", 92);

        System.out.println("TreeMap automatically sorts keys alphabetically:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
