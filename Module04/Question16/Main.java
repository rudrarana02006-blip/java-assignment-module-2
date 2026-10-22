import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Third");
        linkedHashSet.add("First");
        linkedHashSet.add("Second");
        linkedHashSet.add("Fourth");

        System.out.println("LinkedHashSet preserves insertion order:");
        for (String item : linkedHashSet) {
            System.out.println(item);
        }
    }
}
