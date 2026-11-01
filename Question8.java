import java.util.Stack;

class Task {
    private int taskId;
    private String description;

    public Task(int taskId, String description) {
        this.taskId = taskId;
        this.description = description;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + " | Description: " + description);
    }
}

public class Question8 {
    private Stack<Task> taskStack = new Stack<>();

    public void pushTask(Task task) {
        taskStack.push(task);
        System.out.print("Pushed: ");
        task.display();
    }

    public void popTask() {
        if (!taskStack.isEmpty()) {
            Task popped = taskStack.pop();
            System.out.print("Completed & Popped: ");
            popped.display();
        } else {
            System.out.println("No tasks to pop.");
        }
    }

    public void displayRemainingTasks() {
        System.out.println("\nRemaining Tasks in Stack (Top to Bottom):");
        if (taskStack.isEmpty()) {
            System.out.println("No remaining tasks.");
        } else {
            for (int i = taskStack.size() - 1; i >= 0; i--) {
                taskStack.get(i).display();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Question 8: Stack Operations ---");
        Question8 manager = new Question8();

        manager.pushTask(new Task(1, "Design System Architecture"));
        manager.pushTask(new Task(2, "Implement Database Schema"));
        manager.pushTask(new Task(3, "Write Unit Tests"));

        manager.displayRemainingTasks();

        System.out.println("\nPopping top task...");
        manager.popTask();

        manager.displayRemainingTasks();
    }
}
