import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
