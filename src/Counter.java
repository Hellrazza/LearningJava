public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int getValue() {
        return value;
    }

    public void increase() { value++;}

    public void increase(int incrementValue) {
        value += incrementValue;
    }

    public void decrease() { value--;}

    public void decrease(int decreaseValue) {
        value -= decreaseValue;
    }
}
