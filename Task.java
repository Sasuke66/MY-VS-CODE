import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public void markAsIncomplete() {
        this.completed = false;
    }
}

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getDescription());
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markAsCompleted();
            System.out.println("Task completed: " + task.getDescription());
        } else {
            System.out.println("Invalid task index!");
        }
    }

    public void incompleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.markAsIncomplete();
            System.out.println("Task marked as incomplete: " + task.getDescription());
        } else {
            System.out.println("Invalid task index!");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                String status = task.isCompleted() ? "Completed" : "Incomplete";
                System.out.println((i + 1) + ". " + task.getDescription() + " - " + status);
            }
        }
    }
}
