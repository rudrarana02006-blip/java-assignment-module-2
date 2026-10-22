import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static boolean isPalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"racecar", "radar", "hello", "Madam", "world"};
        for (String word : words) {
            System.out.println(word + " -> " + (isPalindrome(word) ? "Palindrome" : "Not a Palindrome"));
        }
    }
}
