public class Whistle {
    private final String sound;

    public Whistle(String sound) {
        this.sound = sound;
    }

    public void playSound() {
        System.out.println(this.sound);
    }
}
