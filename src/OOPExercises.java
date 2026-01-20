public class OOPExercises {
    public static void main(String[] args) {
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
}
