public class TripleTacoBox implements TacoBox {
    private Object tacos;

    public TripleTacoBox() {
        tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return (int) tacos;
    }

    @Override
    public void eat() {
        if ((int) tacos == 0) {
            return;
        }

        tacos = (int) tacos - 1;
    }



}
