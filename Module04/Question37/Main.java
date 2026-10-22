import java.util.ArrayList;
import java.util.List;

class TodoList {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removed = tasks.remove(index);
            System.out.println("Removed: " + removed);
        } else {
            System.out.println("Invalid task index: " + index);
        }
    }

    public void displayTasks() {
        System.out.println("Current To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        todo.addTask("Complete Java Assignment");
        todo.addTask("Review Generics & Collections");
        todo.addTask("Push code to GitHub");

        todo.displayTasks();
        todo.removeTask(1);
        todo.displayTasks();
    }
}
