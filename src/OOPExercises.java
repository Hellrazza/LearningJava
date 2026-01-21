import jdk.dynalink.beans.StaticClass;

import java.security.Guard;
import java.util.ArrayList;
import java.util.Scanner;

public class OOPExercises {
    public static void main(String[] args) {
        tvExercise();
    }

    public static void sandboxing() {
        Account ryansAccount = new Account("Ryan's account", 100.00);

        System.out.println("Initial state");
        System.out.println(ryansAccount);

        ryansAccount.withdraw(20);
        System.out.println("Ryan's balance is now: " + ryansAccount.balance());

        ryansAccount.deposit(200.00);
        System.out.println("Ryan's balance is now: " + ryansAccount.balance());

        System.out.println("Final state");
        System.out.println(ryansAccount);
    }

    public static void YourFirstBankTransfer() {
        Account matthewsAccount = new Account("Matthew's account", 1000);
        Account myAccount = new Account("My Account", 0);
        matthewsAccount.withdraw(100);
        myAccount.deposit(100);

        System.out.println(matthewsAccount+"\n"+myAccount);


    }

    public static void soundMethod() {
        Whistle duckWhistle = new Whistle("Quack");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.playSound();
        roosterWhistle.playSound();
        duckWhistle.playSound();
    }

    public static void doorExercise() {
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();
    }

    public static void productExercise() {
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
    }

    public static void decreasingCounterExercise() {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }

    public static void debtExercise() {
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years++;
        }

        mortgage.printBalance();
    }

    public static void songExercise() {
        Song garden = new Song("In the Garden", 10910);
        System.out.println("The song " + garden.getName() + " has a duration of " + garden.getLength() + " seconds.");
    }

    public static void filmExercise() {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel.", 5);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.getAgeRating()) {
            System.out.println("You may watch the film " + chipmunks.getFilmName());
        } else {
            System.out.println("You may not watch the film " + chipmunks.getFilmName());
        }
    }

    public static void gaugeExercise() {
        Gauge g = new Gauge();

        while (!g.isFull()) {
            System.out.println("Not full! Value: " + g.getValue());
            g.increase();
        }

        System.out.println("Full! Value: " + g.getValue());
        g.decrease();
        System.out.println("Not Full! Value: " + g.getValue());
    }

    public static void agentExercise() {
        Agent bond = new Agent("James", "Bond");
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }

    public static void multiplierExercise() {
        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }

    public static void statisticsExercise() {
        Statistics allStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Numbers");
        int input = Integer.parseInt(scanner.nextLine());

        while(input != -1) {
            allStats.addNumber(input);

            if (input % 2 == 0) {
                evenStats.addNumber(input);
            } else {
                oddStats.addNumber(input);
            }
            input = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Sum: " + allStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }

    public static void tvExercise() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgramme> programmeList = new ArrayList<>();
        String programmeName = "";
        int programmeDuration = 0;

        while (true) {
            System.out.println("Enter programme name: ");
            programmeName = scanner.nextLine();

            if (programmeName.isEmpty()) break;

            System.out.println("Enter programme duration in minutes: ");
            programmeDuration = Integer.parseInt(scanner.nextLine());

            programmeList.add(new TelevisionProgramme(programmeName, programmeDuration));
        }

        System.out.println("Enter maximum duration: ");
        int durationQuery = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgramme programme : programmeList) {
            if (programme.getDuration() <= durationQuery) {
                System.out.println(programme);
            }
        }


    }
}
