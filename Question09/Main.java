import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is " + age + ". Age must be at least 18.");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("app_error.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(true);

            validateAge(22);
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
            logger.log(Level.SEVERE, "InvalidAgeException occurred", e);
        } catch (IOException e) {
            System.out.println("File handler error: " + e.getMessage());
        } finally {
            if (fileHandler != null) {
                fileHandler.close();
            }
        }
    }
}
