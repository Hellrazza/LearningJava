import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        int totalNumbers = 0;
        double total = 0;

        while (input != 0) {
            System.out.println("Enter a number: ");
            input = Integer.parseInt(scanner.nextLine());

            if (input > 0) {
                total += input;
                totalNumbers++;
            }
        }

        if (totalNumbers == 0) {
            System.out.println("Cannot Calculate Average!");
        } else {
            System.out.println("Average is: " + (total/totalNumbers));
        }
    }
}
