public class ListObjectExercises {
    public static void main(String[] args) {
      holdExercise();
    }

    public static void menuExercise() {
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }

    public static void stackExercise() {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }

    public static void messageExercise() {
        MessagingService msm = new MessagingService();
        msm.add(new Message("Ryan","Hello there"));
        msm.add(new Message("Armani", "Bing Chilling"));

        System.out.println(msm.getMessageList());

    }

    public static void collectionExercise() {
        SimpleCollection s = new SimpleCollection("characters");
        System.out.println(s);

        System.out.println();

        System.out.println("Longest: " + s.longest());

        s.add("magneto");
        System.out.println(s);

        System.out.println();

        s.add("mystique");
        System.out.println(s);

        System.out.println();

        s.add("phoenix");
        System.out.println(s);

        System.out.println("Longest: " + s.longest());
    }

    public static void santaWorkshopExercise() {
        Gift book = new Gift("Harry Potter and the Philospher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);


        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.getTotalWeight());
    }

    public static void roomExercise() {
        Room room = new Room();
        room.add(new Individual("Lea", 183));
        room.add(new Individual("Kenya", 182));
        room.add(new Individual("Auli", 186));
        room.add(new Individual("Nina", 172));
        room.add(new Individual("Terhi", 185));

        System.out.println("");
        for (Individual individual : room.getIndividuals()) {
            System.out.println(individual);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Individual individual : room.getIndividuals()) {
            System.out.println(individual);
        }
        room.add(new Individual("Nina", 172));

        System.out.println();
        System.out.println("Shortest to tallest");

        while (!room.isEmpty()) {
            System.out.println(room.take());
        }
    }


    public static void holdExercise() {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();


    }
}
