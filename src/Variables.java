import java.util.Scanner;

public class Variables {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println("Enter an Integer: ");
        int integer = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter a double: ");
        double dbl = Double.valueOf(scanner.nextLine());

        System.out.println("Enter a boolean: ");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("String: "+ string);
        System.out.println("Integer: "+ integer);
        System.out.println("Double: "+ dbl);
        System.out.println("Bool: "+ bool);

    }
}
