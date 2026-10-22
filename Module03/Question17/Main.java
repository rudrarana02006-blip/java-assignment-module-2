import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "char_input.txt";
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write("Reading file using Character Stream (FileReader).");
        } catch (IOException e) {
            System.out.println("Error creating input file: " + e.getMessage());
        }

        try (FileReader fr = new FileReader(filename)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
