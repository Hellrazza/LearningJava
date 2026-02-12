public class Doggy extends Animal implements NoiseCapable{

    public Doggy(String name) {
        super(name);
    }

    public Doggy() {
        super("Dog");
    }

    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    public void makeNoise() {bark();}
}
