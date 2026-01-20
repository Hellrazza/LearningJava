import java.util.ArrayList;
import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LoginSystem(scanner);
    }

    public static String printThrice(String input) {
        return input + input + input;
    }

    public static String isItTrue(String input) {
        if (input.equals("true")) {
            return "You got it right!";
        }
        else {
            return "Try again!";
        }
    }

    public static void LoginSystem(Scanner scanner) {
        //experimenting with 2D array, not intended as part of course

        String[][] credentials = new String[2][2];

        credentials[0][0] = "alex";
        credentials[0][1] = "sunshine";

        credentials[1][0] = "emma";
        credentials[1][1] = "haskell";

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        // bad practice for credential system, used for learning purposes.
        for(int i = 0; i < credentials.length; i++) {
            if (username.equals(credentials[i][0])) {
                if(password.equals(credentials[i][1])) {
                    System.out.println("Welcome " + username);
                }
                else {
                    System.out.println("Incorrect credentials");
                }
            }
        }



    }
}
