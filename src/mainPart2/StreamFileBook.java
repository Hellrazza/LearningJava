public class StreamFileBook {
    private String name;
    private int publishYear;
    private int pageCount;
    private String author;

    public StreamFileBook(String name, int publishYear, int pageCount, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.pageCount = pageCount;
        this.author = author;
    }

    public String toString() {
        return name + " (" + pageCount + " pgs), by " + author + " (" + publishYear + ")";
    }


}
