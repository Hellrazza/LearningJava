public class Multiplier {
    private int value;

    public Multiplier(int multiplierValue) {
        this.value = multiplierValue;
    }

    public int multiply(int number) {
        return number * this.value;
    }
}
