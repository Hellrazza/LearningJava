import java.util.ArrayList;
import java.util.Scanner;

public class ArchiveSystem {
    public static void main(String[] args) {
        ArrayList<ArchiveItem> archiveList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String itemIdentifier = "";
        String itemName = "";

        while (true) {
            System.out.println("Enter item identifier (empty will stop): ");
            itemIdentifier = scanner.nextLine();

            if(itemIdentifier.isEmpty()) break;

            System.out.println("Enter item name (empty will stop): ");
            itemName = scanner.nextLine();

            if(itemName.isEmpty()) break;

            ArchiveItem itemToAdd = new ArchiveItem(itemIdentifier, itemName);
            if(!archiveList.contains(itemToAdd)) {
                archiveList.add(itemToAdd);
            }
        }

        for (ArchiveItem item : archiveList) {
            System.out.println(item);
        }
    }

}
