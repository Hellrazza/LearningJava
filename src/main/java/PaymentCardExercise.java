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
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.getBalance() + " euros");

        System.out.println(unicafeExactum);
    }
}
