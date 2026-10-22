import java.util.HashMap;
import java.util.Map;

class BookCatalog {
    private Map<String, String> catalog = new HashMap<>();

    public void addBook(String title, String author) {
        catalog.put(title.toLowerCase(), author);
        System.out.println("Added: '" + title + "' by " + author);
    }

    public void searchByTitle(String title) {
        String key = title.toLowerCase();
        if (catalog.containsKey(key)) {
            System.out.println("Found: '" + title + "' is written by " + catalog.get(key));
        } else {
            System.out.println("Book not found: '" + title + "'");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BookCatalog library = new BookCatalog();
        library.addBook("Clean Code", "Robert C. Martin");
        library.addBook("Effective Java", "Joshua Bloch");
        library.addBook("Design Patterns", "Erich Gamma et al.");

        library.searchByTitle("Effective Java");
        library.searchByTitle("Unknown Book");
    }
}
