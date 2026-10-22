import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        String[] keys = {"One", "Two", "Three", "Four", "Five"};
        for (int i = 0; i < keys.length; i++) {
            hashMap.put(keys[i], i + 1);
            linkedHashMap.put(keys[i], i + 1);
        }

        System.out.println("HashMap iteration order (no order guarantee): " + hashMap.keySet());
        System.out.println("LinkedHashMap iteration order (preserves insertion order): " + linkedHashMap.keySet());
    }
}
