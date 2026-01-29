public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int num) {
        value += num;
    }

    public void minus(int num) {
        value -= num;
    }

    public int getValue() {
        return value;
    }
}
