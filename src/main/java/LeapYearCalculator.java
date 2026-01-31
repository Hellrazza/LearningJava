import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = Integer.parseInt(scanner.nextLine());


        // If the year is exactly divisible by 100 and 400 then it is a leap year. E.G: 1700 !leapYear | 2000 leapYear
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year!");
        }
        else {
            System.out.println(year + " is not a leap year!");
        }
    }
}

