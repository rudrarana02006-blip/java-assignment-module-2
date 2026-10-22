import java.util.Map;
import java.util.TreeMap;

class GradeBook {
    private Map<String, Double> grades = new TreeMap<>();

    public void addGrade(String name, double grade) {
        grades.put(name, grade);
        System.out.println("Added grade for " + name + ": " + grade);
    }

    public void removeGrade(String name) {
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println("Removed grade for: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public void queryGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println("Grade for " + name + ": " + grades.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public void displayAll() {
        System.out.println("All student grades (alphabetical by name):");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GradeBook book = new GradeBook();
        book.addGrade("Rudra", 96.5);
        book.addGrade("Alice", 91.0);
        book.addGrade("Bob", 84.0);

        book.displayAll();
        book.queryGrade("Rudra");
        book.removeGrade("Bob");
        book.displayAll();
    }
}
