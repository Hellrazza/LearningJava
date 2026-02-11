public class CustomTacoBox implements TacoBox {
    private Object tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return (int) tacos;
    }

    @Override
    public void eat() {
        if ((int)tacos == 0) {
           return;
        }

        tacos = (int) tacos - 1;
    }
}
