import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {
        WarehouseExercise();
    }

    public static void ABCExercise() {
        C c = new C();
        c.a();
        c.b();
        c.c();
    }

    public static void PersonAndSubClassesExercise() {
        ArrayList<PersonIN> persons = new ArrayList<PersonIN>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    public static void printPersons(ArrayList<PersonIN> persons) {
        for (PersonIN person : persons) {
            System.out.println(person);
        }
    }

    public static void WarehouseExercise() {
        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.removeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955
    }

}
