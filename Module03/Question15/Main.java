import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "sample.txt";
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write("Hello from Byte Stream!\n".getBytes());
        } catch (IOException e) {
            System.out.println("Error creating sample file: " + e.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
