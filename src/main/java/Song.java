public class Song {
    private String name;
    private String artist;
    private int length;

    public Song(String name, String artist, int length) {
        this(name, length);
        this.artist = artist;
    }

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }


    public String getName() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true; // they are located in the same position so equal
        }

        if (!(compared instanceof Song)) {
            return false; // object is not Song so not equal;
        }

        Song comparedSong = (Song) compared;

        if (this.name.equals(comparedSong.name) && this.artist.equals(comparedSong.artist) && this.length == comparedSong.length) {
            return true;
        }
        return false;
    }
}
