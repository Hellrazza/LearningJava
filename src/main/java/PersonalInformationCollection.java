import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> listOfPeople = new ArrayList<>();
        String firstName = "";
        String lastName = "";
        String identificationNumber = "";

        while (true) {
            System.out.println("Enter first name: ");
            firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }
            System.out.println("Enter last name: ");
            lastName = scanner.nextLine();
            System.out.println("Enter identification number: ");
            identificationNumber = scanner.nextLine();
            listOfPeople.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        for (PersonalInformation person : listOfPeople) {
            System.out.println(person);
        }
    }
}
