public class PaymentCardExercise {
    public static void main(String[] args) {
        PaymentCardExerciseTerminal();
    }

    public static void PaymentCardExercisePreDumb() {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.addMoney(20);

        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }

    public static void PaymentCardExercisePostDumb() {
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("Money: " + petesCard.getBalance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money: " + petesCard.getBalance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("Successfully withdrew: " + wasSuccessful);
        System.out.println("Money: " + petesCard.getBalance());
    }

    public static void PaymentCardExerciseTerminal() {
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("Remaining Change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("Was there enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("Was there enough money: " + wasSuccessful);

        wasSuccessful = unicafeExactum.eatAffordably(annesCard);
        System.out.println("Was there enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);

    }
}
