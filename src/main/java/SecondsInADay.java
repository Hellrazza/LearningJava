import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days do you want to convert to seconds: ");
        int days = Integer.parseInt(scanner.nextLine());

        int daysAsSeconds = days * 24 * 60 * 60;
        System.out.println("There are "+ daysAsSeconds + " seconds in "+days+ " days");

    }
}
