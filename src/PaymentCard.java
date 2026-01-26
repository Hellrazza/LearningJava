public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public double getBalance() {return this.balance;}

    public String toString() {
        return "The card has a balance of £" + this.balance;
    }

    public void eatAffordably() {
        if (this.balance - 2.60 < 0) {
            return;
        } else {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.60 < 0) {
            return;
        } else {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount <= 0) {
            return;
        }
        if (this.balance + amount <= 150) {
            this.balance += amount;
        } else {
            this.balance = 150;
        }
    }

    public boolean takeMoney(double amount) {
        if (balance >= amount)
        {
            balance -= amount;
            return true;
        }
        else
        {
            return false;
        }
    }
}
