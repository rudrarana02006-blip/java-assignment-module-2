import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println("Adding 'Java': " + set.add("Java"));
        System.out.println("Adding 'Python': " + set.add("Python"));
        System.out.println("Adding 'C++': " + set.add("C++"));
        System.out.println("Adding duplicate 'Java': " + set.add("Java"));

        System.out.println("Final HashSet elements: " + set);
    }
}
