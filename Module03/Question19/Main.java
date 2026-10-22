import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "buffered_example.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Line 1: Buffered I/O Performance Optimization");
            writer.newLine();
            writer.write("Line 2: Writing using BufferedWriter");
            System.out.println("File written using BufferedWriter.");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading file using BufferedReader:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
