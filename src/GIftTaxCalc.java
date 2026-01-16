import java.util.Scanner;

public class GIftTaxCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value of gift: ");
        int value = Integer.parseInt(scanner.nextLine());
        int taxRate = 0;

        if (value > 5000 && value <= 25000) {
            taxRate = 8;
        }
        else if (value > 25000 && value <= 55000) {
            taxRate = 10;
        }
        else if (value > 55000 && value <= 200000) {
            taxRate = 12;
        }
        else if (value > 200000 && value <= 1000000) {
            taxRate = 15;
        }
        else if (value > 1000000) {
            taxRate = 17;
        }

        if (taxRate != 0) {
            int priceAfterTax = ()
        }
    }
}
