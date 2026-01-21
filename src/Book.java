public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String bookTitle, int numberOfPages, int publicationYear) {
        this.title = bookTitle;
        this.pages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

    public String getTitle() {
        return this.title;
    }
}
