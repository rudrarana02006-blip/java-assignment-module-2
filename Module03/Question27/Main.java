import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testEmails = {
            "rudrarana@example.com",
            "student.blip@university.edu",
            "invalid-email@",
            "@missingusername.com",
            "hello.world@sub.domain.org"
        };

        for (String email : testEmails) {
            System.out.println(email + " -> " + (isValidEmail(email) ? "Valid" : "Invalid"));
        }
    }
}
