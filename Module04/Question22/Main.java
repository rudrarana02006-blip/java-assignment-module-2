import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        taskQueue.add(new Task("Write Report", 3));
        taskQueue.add(new Task("Fix Production Bug", 1));
        taskQueue.add(new Task("Reply to Emails", 2));

        System.out.println("Initial PriorityQueue: " + taskQueue);
        System.out.println("Processing highest priority task: " + taskQueue.poll());
        System.out.println("Remaining tasks in queue: " + taskQueue);
    }
}
