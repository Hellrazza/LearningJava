import java.util.Scanner;

public class JokeManagerUI {
    private final JokeManager manager;
    private final Scanner scanner;

    public JokeManagerUI(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("What a joke!");

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }
            if (command.equals("1")) {
                addJoke();
            } else if (command.equals("2")) {
                drawJoke();
            } else if (command.equals("3")) {
                printJokes();
            }
        }

    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        manager.add(joke);
    }

    public void drawJoke() {
        System.out.println("Drawing a joke.");
        manager.drawJoke();
    }

    public void printJokes() {
        System.out.println("Printing the jokes.");
        manager.listJokes();
    }

}
