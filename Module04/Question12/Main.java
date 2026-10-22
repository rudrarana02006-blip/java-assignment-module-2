import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("New York");
        cities.add("London");
        cities.add("Berlin");

        System.out.println("Original list: " + cities);

        Collections.sort(cities);
        System.out.println("Alphabetical order: " + cities);

        Collections.sort(cities, Collections.reverseOrder());
        System.out.println("Reverse alphabetical order: " + cities);
    }
}
