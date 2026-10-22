import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("to_delete.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Temporary file created: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully: " + file.getName());
            } else {
                System.out.println("Failed to delete file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
