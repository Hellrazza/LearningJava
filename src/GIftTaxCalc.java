import java.util.Scanner;

public class GIftTaxCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value of gift: ");
        int value = Integer.parseInt(scanner.nextLine());
        double taxRate = 0;
        int fixedTax = 0;
        int lowerLimit = 0;

        if (value >= 5000 && value < 25000) {
            taxRate = 0.8;
            fixedTax = 100;
            lowerLimit = 5000;
        }
        else if (value >= 25000 && value < 55000) {
            taxRate = 0.10;
            fixedTax = 1700;
            lowerLimit = 25000;
        }
        else if (value >= 55000 && value < 200000) {
            taxRate = 0.12;
            fixedTax = 4700;
            lowerLimit = 55000;
        }
        else if (value >= 200000 && value < 1000000) {
            taxRate = 0.15;
            fixedTax = 22100;
            lowerLimit = 200000;
        }
        else if (value >= 1000000) {
            taxRate = 0.17;
            fixedTax = 142000;
            lowerLimit = 1000000;
        }

        if (taxRate != 0) {
            double taxOwed = fixedTax + (value - lowerLimit) * taxRate;
            System.out.println("Tax: " + taxOwed);
        }
        else {
            System.out.println("No Tax!");
        }
    }
}
