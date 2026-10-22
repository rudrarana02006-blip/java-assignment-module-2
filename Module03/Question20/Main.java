import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("test_file.txt");

        if (file.exists()) {
            System.out.println("File already exists: " + file.getAbsolutePath());
        } else {
            System.out.println("File does not exist. Creating file...");
            try {
                if (file.createNewFile()) {
                    System.out.println("File created successfully: " + file.getName());
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
