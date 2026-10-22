import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String content = "Writing using FileWriter into example.txt";
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write(content);
            System.out.println("Successfully written to example.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
