public class Account {
    private double balance;
    private String name;

    public Account (String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double balance() {
        return this.balance;
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return "Name: " + name() + ", Balance: " + balance();
    }
}
