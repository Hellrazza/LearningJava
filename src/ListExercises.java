import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListExercises {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);

        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);

        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);

        System.out.println(sum(numbers));

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if ( number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static int sum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static void removeLast(ArrayList<String> strings) {
        if (strings.isEmpty()) {
            return;
        } else {
            strings.removeLast();
        }

    }
}
