import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MultiMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, new ArrayList<>());
    }

    public void display() {
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MultiMap<String, String> courseStudents = new MultiMap<>();
        courseStudents.put("Java", "Rudra");
        courseStudents.put("Java", "Alice");
        courseStudents.put("Python", "Bob");
        courseStudents.put("Java", "Charlie");

        System.out.println("MultiMap contents:");
        courseStudents.display();

        System.out.println("Students in Java: " + courseStudents.get("Java"));
    }
}
