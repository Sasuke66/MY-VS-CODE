import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. Mark Task as Incomplete");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    taskManager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task index to mark as completed: ");
                    int completeIndex = scanner.nextInt() - 1;
                    taskManager.completeTask(completeIndex);
                    break;
                case 3:
                    System.out.print("Enter task index to mark as incomplete: ");
                    int incompleteIndex = scanner.nextInt() - 1;
                    taskManager.incompleteTask(incompleteIndex);
                    break;
                case 4:
                    taskManager.displayTasks();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Task Manager...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
