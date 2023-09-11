package main;

import java.util.ArrayList;
import java.util.Scanner;


public class Task_Manager {
    //arraylist to stor the tasks
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int tasksIdCounter = 1;

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Task Manager");
            System.out.println("1. Add tasks");
            System.out.println("2. View tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.println("What do you want to do?");
            int choice = scanner.nextInt();
            //functionality accordin to the cohoice of the user
            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;

                case 2:
                    viewTasks();
                    break;

                case 3:
                    deleteTask(scanner);
                    break;

                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Entry");
            }
        }
    }

    // Methods
    private static void addTask(Scanner scanner) {
        Task task = new Task(tasksIdCounter, null, null, null, null);
        task.setTaskId(tasksIdCounter);
        task.setTitle(getUserInput("Enter Task Title:", scanner));
        task.setDescription(getUserInput("Enter Description:", scanner));
        task.setPriority(getUserInput("Enter Task Priority:", scanner));
        task.setDueDate(getUserInput("Enter Task DueDate:", scanner));

        // Adding the task into the list
        tasks.add(task);
        System.out.println("Task added successfully.");
        tasksIdCounter++;
    }

    private static String getUserInput(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.next();
    }

    private static void viewTasks() {
        System.out.println("Task List:");
        for (Task task : tasks) {
            System.out.println("Task ID: " + task.getTaskId());
            System.out.println(task);
        }
    }

    // Inside the TaskManager class
    private static void deleteTask(Scanner scanner) {
        System.out.print("Enter the task ID to delete: ");
        int taskIdToDelete = scanner.nextInt();

        // Find and remove the task with the specified ID
        boolean taskFound = false;
        for (Task task : tasks) {
            if (task.getTaskId() == taskIdToDelete) {
                tasks.remove(task);
                taskFound = true;
                System.out.println("Task deleted successfully.");
                break; // Exit the loop after deleting the task
            }
        }

        if (!taskFound) {
            System.out.println("Task not found with the specified ID.");
        }
    }
}
