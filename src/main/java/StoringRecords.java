import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: "); //.csv
        String fileName = scanner.nextLine();
        ArrayList<Person> people = readRecordsFromFile(fileName);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> people = new ArrayList<>();
        String person = "";
        String[] parts;
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                person = reader.nextLine();
                parts = person.split(",");
                people.add(new Person(parts[0],Integer.parseInt(parts[1])));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + file);
            return people;
        }


        return people;
    }
}
