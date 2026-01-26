public class Book {
    private String title;
    private String author;
    private int pages;
    private int publicationYear;

    public Book(String author, String bookTitle, int numberOfPages, int publicationYear) {
        this.author = author;
        this.title = bookTitle;
        this.pages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return this.author + "," + this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {return this.author;}

    public int getPages() {return this.pages;}
}
