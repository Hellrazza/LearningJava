import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        ArrayList<Item> itemArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String input = scanner.nextLine();

        while (!input.isEmpty()) {
            itemArrayList.add(new Item(input));

            System.out.println("Name: ");
            input = scanner.nextLine();
        }

        for (Item item : itemArrayList) {
            System.out.println(item);
        }
    }
}
