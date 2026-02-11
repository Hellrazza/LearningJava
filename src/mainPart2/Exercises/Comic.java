public class Comic implements Packable {
    private final String name;
    private final String author;
    private final double weight;

    public Comic(String name, String author, double weight) {
        this.name = name;
        this.author = author;
        this.weight = weight;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.author + ": " + this.name;
    }


}
