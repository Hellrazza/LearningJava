import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamExercises {
    public static void main(String[] args) {
        booksFromFileExercise();
    }

    public static void averageOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        while(true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            inputs.add(line);
        }

        double average = inputs.stream()
                .mapToInt(s -> Integer.parseInt(s)).average().getAsDouble();

        System.out.println(average);
    }

    public static void averageOfSelectedNumbers() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {break;}

            inputs.add(input);
        }

        String input = "";
        while(true) {
            System.out.println("Postive or Negative: p/n");
            input = scanner.nextLine();

            if (input.equals("n") || input.equals("p")){
                break;
            } else {
                System.out.println("Not valid selection.");
            }
        }

        double average = 0.0;

        if(input.equals("n")) {
            average = inputs.stream().mapToInt(Integer::parseInt)
                .filter(number -> number < 0).average().getAsDouble();
        }
        else if (input.equals("p")) {
            average = inputs.stream().mapToInt(Integer::parseInt)
                    .filter(number -> number > 0).average().getAsDouble();
        }

        System.out.println(average);

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void positiveNumbersExercise() {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(2);
        nums.add(5);
        nums.add(6);

        nums = positive(nums);

        System.out.println(nums);
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> nums) {
        return nums.stream().filter(number -> number % 2 == 0 || number % 3 == 0 || number % 5 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    public static void DivisibleExercise() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(num -> System.out.println(num));
    }

    public static void InputExercise() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }

        inputs.forEach(System.out::println);
    }

    public static void LimitedNumbersExercise() {
        Scanner scanner = new Scanner(System.in);
        List<String> nums = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            if(Integer.parseInt(input) < 0) {
                break;
            }
            nums.add(input);
        }
        nums.stream().mapToInt(Integer::parseInt).filter(number -> number >=1 && number <= 5).forEach(System.out::println);
    }

    public static void UniqueLastNames() {
        Scanner scanner = new Scanner(System.in);
        List<StreamPerson> people = new ArrayList<>();
        String first = "";
        String last = "";
        int year = 0;
        while (true) {
            System.out.println("Continue input? quit ends.");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            System.out.println("First name?");
            first = scanner.nextLine();
            last = scanner.nextLine();
            year = Integer.parseInt(scanner.nextLine());

            people.add(new StreamPerson(first, last, year));
        }

        System.out.println("Unique last: ");
        people.stream().map(StreamPerson::getLast).distinct().forEach(System.out::println);

    }

    public static void streamFiles() {
        System.out.println(read("file.txt"));
    }

    public static List<String> read(String fileName) {
        List<String> contents = new ArrayList<>();
        try {
            Files.lines(Paths.get(fileName)).forEach(row -> contents.add(row));
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return contents;
    }

    public static void booksFromFileExercise() {
        System.out.println(BooksFromFile.readFromFile("books.txt"));
    }
}
