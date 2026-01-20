public class OOPExercises {
    public static void main(String[] args) {
        songExercise();
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
}
