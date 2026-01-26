public class PaymentTerminal {
    private double money; // amount of cash in register
    private int affordableMealsSold;
    private int heartyMealsSold;
    private double affordableMealPrice;
    private double heartyMealPrice;

    public PaymentTerminal() {
        this.money = 1000;

        this.affordableMealsSold = 0;
        this.heartyMealsSold = 0;

        this.affordableMealPrice = 2.50;
        this.heartyMealPrice = 4.30;
    }

    public double eatAffordably(double payment) {
        if (payment < affordableMealPrice) {
            return payment;
        }

        money += affordableMealPrice;
        affordableMealsSold++;

        return payment - affordableMealPrice;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(affordableMealPrice)) {
            affordableMealsSold++;
            return true;
        }
        return false;
    }

    public double eatHeartily(double payment) {
        if (payment < heartyMealPrice) {
            return payment;
        }

        money += heartyMealPrice;
        heartyMealsSold++;

        return payment - heartyMealPrice;
    }

    public boolean eatHeartily(PaymentCard card) {
        if(card.takeMoney(heartyMealPrice)) {
            heartyMealsSold++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        money += sum;

    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMealsSold + ", number of sold hearty meals: " + heartyMealsSold;
    }
}
