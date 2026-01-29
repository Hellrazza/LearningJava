import java.util.Scanner;

public class LiquidContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
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
            amount = Math.abs(Integer.parseInt(parts[1]));
            if (command.equals("add")) {
                first += amount;
                if (first > 100) {first = 100;}
            }
            else if (command.equals("move")) {

                first -= amount;
                second += amount;

                if (first <  0) {
                    first = 0;
                }

                if (second > 100) {
                    second = 100;
                }
            }
            else if (command.equals("remove")) {
                second -= amount;
                if (second < 0) {second = 0;}
            }

            System.out.println("First:" + first + "/100");
            System.out.println("Second:" + second + "/100");
         }
    }

}
