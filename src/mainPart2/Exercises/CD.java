public class CD implements Packable {
    private final String name;
    private final String artist;
    private int publicationYear;

    public CD(String name, String artist, int publicationYear) {
        this.name = name;
        this.artist = artist;
        this.publicationYear = publicationYear;
    }

    public double weight() {
        return 0.1;
    }

    public String toString() {
        return this.name + ": " + this.artist;
    }
}
