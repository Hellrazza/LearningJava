import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {
        MisplacingItemBoxExercise();
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

    public static void WarehouseWithChangeHistoryExercise() {
        WarehouseWithProductHistory juice = new WarehouseWithProductHistory("Juice", 1000.0, 1000.0);
        juice.removeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        juice.printAnalysis();
    }

    public static void AbstractBoxExercise() {
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
    }

    public static void OneItemBoxExercise() {
        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }

    public static void MisplacingItemBoxExercise() {
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }

}
