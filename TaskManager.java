import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();
        boolean exit = false;

        while (!exit) {
            System.out.println("Please choose an option:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. View tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter task:");
                    scanner.nextLine();
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added.");
                    break;

                case 2:
                    if (tasks.size() == 0) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.println("Enter task number to remove:");
                        int taskNumber = scanner.nextInt();
                        if (taskNumber > tasks.size() || taskNumber <= 0) {
                            System.out.println("Invalid task number.");
                        } else {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task removed.");
                        }
                    }
                    break;

                case 3:
                    if (tasks.size() == 0) {
                        System.out.println("No tasks to display.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
