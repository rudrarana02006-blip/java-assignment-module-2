import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        try (FileOutputStream fos = new FileOutputStream(sourceFile)) {
            fos.write("Content to be copied using byte stream.".getBytes());
        } catch (IOException e) {
            System.out.println("Error setting up source: " + e.getMessage());
        }

        try (FileInputStream in = new FileInputStream(sourceFile);
             FileOutputStream out = new FileOutputStream(destFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully from " + sourceFile + " to " + destFile);
        } catch (IOException e) {
            System.out.println("File copy failed: " + e.getMessage());
        }
    }
}
