import java.util.Scanner;

public class BirdRegisterUI {
    private Scanner scanner;
    private BirdRegister birdRegister;

    public BirdRegisterUI(Scanner scanner, BirdRegister birdRegister) {
        this.scanner = scanner;
        this.birdRegister = birdRegister;
    }

    public void start() {
        loop:while (true) {
            System.out.println("""
                    Commands:
                    Add - Adds a bird
                    Observation - Adds a bird Sighting
                    All - Prints all Birds
                    One - Prints one bird
                    Quit - quit application
                    """);
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("add")) {addBird();}
            else if (input.equalsIgnoreCase("observation")) { addObservation();}
            else if (input.equalsIgnoreCase("all")) { printAllBirds();}
            else if (input.equalsIgnoreCase("one")) { printOneBird();}
            else if (input.equalsIgnoreCase("quit")) { break loop; }
            else {
                System.out.println("Unknown Command!");
            }
        }
    }

    public void addBird() {
        System.out.println("Enter Bird English Name: ");
        String englishName = scanner.nextLine().toLowerCase();
        System.out.println("Enter Bird Latin Name: ");
        String latinName = scanner.nextLine().toLowerCase();

        if(birdRegister.addBird(englishName, latinName)) {
            System.out.println("Bird added.");
        } else {
            System.out.println("Bird already exists!");
        }
    }

    public void addObservation() {
        System.out.println("Enter bird name: ");
        String birdName = scanner.nextLine().toLowerCase();
        if (birdRegister.addObservation(birdName)) {
            System.out.println("Observation Added");
        } else {
            System.out.println("Bird does not exist");
        }
    }

    public void printAllBirds() {
        System.out.println("Registered Birds: ");
        for (Bird bird : birdRegister.getBirds()) {
            System.out.println(bird);
        }
        System.out.println();
    }

    public void printOneBird() {
        System.out.println("Enter bird name: ");
        String birdName = scanner.nextLine().toLowerCase();
        Bird bird = birdRegister.findBirdByName(birdName);
        if (bird == null) {
            System.out.println("Bird does not exist.");
        }
        else {
            System.out.println(bird);
        }
    }
}
