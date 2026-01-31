import java.util.Scanner;

public class RepeatingBreakingRemember {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int total = 0;
        int totalNumbers = 0;
        int totalEven = 0;
        int totalOdd = 0;

        while (loop) {
            System.out.println("Enter a number: ");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + total);
                System.out.println("Numbers: " + totalNumbers);
                System.out.println("Average: " + (double) total/totalNumbers);
                System.out.println("Odd: " + totalOdd);
                System.out.println("Even: " + totalEven);
                loop = false;
            } else {
                total += input;
                totalNumbers++;
                if(input % 2 == 0) {
                    totalEven++;
                }
                else {
                    totalOdd++;
                }
            }
        }
    }
}
