public class PolymorphismExercises {
    public static void main(String[] args) {
        AnimalExercise();
    }

    public static void OrganismExercise() {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);

        herd.move(1,1);
        System.out.println(herd);
    }

    public static void AnimalExercise() {
        NoiseCapable dog = new Doggy();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }
}
