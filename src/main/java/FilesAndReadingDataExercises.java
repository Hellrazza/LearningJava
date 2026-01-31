import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FilesAndReadingDataExercises {
    public static void main(String[] args) {
        recordsFromFile();
    }

    public static void numberOfStrings() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int count = 0;
        System.out.println("Enter Strings. (Type end to finish)");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }
            count++;
        }

        System.out.println(count);
    }

    public static void cubes() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("Enter Numbers. (Type end to finish)");

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }
            System.out.println(Math.pow(Integer.parseInt(input),3));
        }
    }

    public static void printingAFile() {
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))){
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void printingASpecificFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(fileName))){
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void GuestListFromAFile() {
        ArrayList<String> guests = new ArrayList<>();
        String guest = "";
        String input = "";
        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter name of file: ");
        input = scanner.nextLine();
        try (Scanner reader = new Scanner((Paths.get(input)))) {
            while(reader.hasNextLine()) {
                guest = reader.nextLine();
                guests.add(guest);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        while (true) {
            System.out.println("Enter guest name: (End to finish)");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("Thank you!");
                break;
            }

            if (guests.contains(input)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }
    }

    public static void isItInTheFile() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        ArrayList<String> names = new ArrayList<>();
        String name = "";
        System.out.println("Enter file name: ");
        input = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(input))) {
            while (reader.hasNextLine()) {
                name = reader.nextLine();
                names.add(name);
            }
            System.out.println("Search for: ");
            input = scanner.nextLine();

            if (names.contains(input)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + input + " failed.");
        }
    }

    public static void numbersFromFile() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int lowerBound = 0;
        int upperBound = 0;
        int count = 0;
        int number = 0;
        System.out.println("Enter file name: ");
        input = scanner.nextLine();

        System.out.println("Enter lower bound: ");
        lowerBound = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter upper bound: ");
        upperBound = Integer.parseInt(scanner.nextLine());

        try (Scanner reader = new Scanner(Paths.get(input))) {
            while (reader.hasNextLine()) {
                number = Integer.parseInt(reader.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + input);
        }

        System.out.println(count);
    }

    public  static void recordsFromFile() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        String person = "";
        String years = " years";
        String[] parts;

        System.out.println("Name of file");
        input = scanner.nextLine();

        try (Scanner reader = new Scanner (Paths.get(input))) {
            while(reader.hasNextLine()) {
                person = reader.nextLine();
                parts = person.split(",");

                if (Integer.parseInt(parts[1]) == 1) {
                    years = " year";
                }

                System.out.println(parts[0] + ", age: " + parts[1] + years);
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + input);
        }
    }
}
