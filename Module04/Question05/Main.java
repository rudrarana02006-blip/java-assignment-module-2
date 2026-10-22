import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

class Stack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Pop: " + intStack.pop());

        Stack<String> strStack = new Stack<>();
        strStack.push("Java");
        strStack.push("Python");
        System.out.println("String Peek: " + strStack.peek());
        System.out.println("String Pop: " + strStack.pop());
    }
}
