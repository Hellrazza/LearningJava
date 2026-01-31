import java.util.Scanner;

public class TodoListUI {
    private TodoList todoList;
    private Scanner scanner;

    public TodoListUI(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        String input = "";
        loop: while (true) {
            System.out.println("Enter command: ");
            input = scanner.nextLine();
            switch(input.toLowerCase()) {
                case "add":
                    addTask();
                    break;
                case "list":
                    listTasks();
                    break;
                case "remove":
                    removeTask();
                    break;
                case "stop":
                    break loop;
                default:
                    System.out.println("Unknown command.");
            }

        }
    }

    public void addTask() {
        System.out.println("Enter task to add: ");
        todoList.add(scanner.nextLine());
    }

    public void listTasks() {
        todoList.print();
    }

    public void removeTask() {
        System.out.println("Enter id of task to remove: ");
        todoList.remove(Integer.parseInt(scanner.nextLine()));
    }
}
