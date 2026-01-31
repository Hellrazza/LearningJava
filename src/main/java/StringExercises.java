import java.util.Scanner;

public class StringExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        personalDetails(scanner);
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

    public static void LineByLine(Scanner scanner) {

        String[] pieces;
        String input = scanner.nextLine();

        while(!input.isEmpty()) {
            pieces = input.split(" ");
            for(String item : pieces) {
                System.out.println(item);
            }
            input = scanner.nextLine();
        }

    }

    public static void AVClub(Scanner scanner) {
        String[] pieces;
        String input = scanner.nextLine();

        while(!input.isEmpty()) {
            pieces = input.split(" ");

            for (String item : pieces) {
                if(item.contains("av")) {
                    System.out.println(item);
                }
            }

            input = scanner.nextLine();
        }
    }

    public static void firstWords(Scanner scanner) {
        String[] pieces;
        String input = scanner.nextLine();

        while(!input.isEmpty()) {
            pieces = input.split(" ");
            System.out.println(pieces[0]);

            input = scanner.nextLine();
        }
    }

    public static void lastWords(Scanner scanner) {
        String[] pieces;
        String input = scanner.nextLine();

        while(!input.isEmpty()) {
            pieces = input.split(" ");
            System.out.println(pieces[pieces.length - 1]);

            input = scanner.nextLine();
        }
    }

    public static void ageOfOldest(Scanner scanner) {
        String input = scanner.nextLine();
        String[] pieces;
        int currentOldest = 0;

        while(!input.isEmpty()) {
            if(input.contains(",")) {
                pieces = input.split(",");
                if(Integer.parseInt(pieces[1]) > currentOldest) {
                    currentOldest = Integer.parseInt(pieces[1]);
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("The oldest is: " + currentOldest);
    }

    public static void nameOfOldest(Scanner scanner) {
        String input = scanner.nextLine();
        String[] pieces;
        int highestAge = 0;
        String currentOldest = "";

        while(!input.isEmpty()) {
            if(input.contains(",")) {
                pieces = input.split(",");
                if(Integer.parseInt(pieces[1]) > highestAge) {
                    currentOldest = pieces[0];
                }
            }
            input = scanner.nextLine();
        }

        System.out.println("The name of the oldest is: " + currentOldest);
    }


    public static void personalDetails(Scanner scanner) {
        String input = scanner.nextLine();
        String[] pieces;
        String longestName = "";
        double averageBirthYear = 0.0;
        int totalPeople = 0;

        while(!input.isEmpty()) {
            if(input.contains(",")) {
                pieces = input.split(",");
                if(pieces[0].length() > longestName.length()) {
                    longestName = pieces[0];
                }
                averageBirthYear += Double.parseDouble(pieces[1]);
                totalPeople++;
            }

            input = scanner.nextLine();
        }

        if(totalPeople == 0) {
            System.out.println("No people added.");
        } else {
            averageBirthYear = averageBirthYear / totalPeople;
            System.out.println("The longest name is: " + longestName);
            System.out.println("The average of the birth years: " + averageBirthYear);
        }
    }
}
