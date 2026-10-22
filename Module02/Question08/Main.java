public class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is " + age + ". Age must be 18 or older.");
        }
        System.out.println("Access granted. Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(20);
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
