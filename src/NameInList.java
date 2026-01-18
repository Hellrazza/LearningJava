import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class NameInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("Enter a name: ");
            String input = scanner.nextLine();
            if (Objects.equals(input, "")) {
                loop = false;
                System.out.println("Enter name to search for: ");
                String search = scanner.nextLine();
                if(list.contains(search)) {
                    System.out.println(search + " was found!");
                }
                else {
                    System.out.println(search + " was not found!");
                }
            } else {
                list.add(input);
            }
        }
    }
}
