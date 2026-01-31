import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        String input = "";
        String[] parts;
        String command = "";
        int amount = 0;


        while (true) {
            System.out.println("Enter command and amount: ");
            input = scanner.nextLine();

            if(input.equals("quit")) {
                break;
            }

            if (!input.contains(" ")) {
                System.out.println("Incorrect format.");
                continue;
            }

            parts = input.split(" ");
            command = parts[0];
            amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }
            else if (command.equals("move")) {
                first.remove(amount);
                second.add(amount);
            }
            else if (command.equals("remove")) {
                second.remove(amount);
            }

            System.out.println("First:" + first);
            System.out.println("Second:" + second);
         }
    }

}
