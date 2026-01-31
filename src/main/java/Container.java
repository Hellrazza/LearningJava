public class Container {
    private int amount;

    public Container() {
        amount = 0;
    }

    public int getAmount() { return amount;}

    public void add(int total) {
        if (total < 0) {return;}
        amount += total;

        if (amount > 100) { amount = 100; }
    }

    public void remove(int total) {
        if (total < 0) {return;}
        amount -= total;

        if (amount < 0) { amount = 0;}
    }

    public String toString() {
        return amount + "/100";
    }
}
