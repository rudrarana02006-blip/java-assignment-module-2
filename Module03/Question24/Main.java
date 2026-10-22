import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        String filename = "random_access.dat";

        try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {
            file.writeUTF("Hello World! Welcome to Java.");
            System.out.println("Initial file pointer: " + file.getFilePointer());

            file.seek(0);
            System.out.println("Read from start: " + file.readUTF());

            file.seek(2);
            file.writeBytes("Java");

            file.seek(0);
            System.out.println("After seeking and overwriting:");
            int ch;
            while ((ch = file.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("RandomAccessFile error: " + e.getMessage());
        }
    }
}
