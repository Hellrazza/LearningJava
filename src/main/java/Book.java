import java.util.*;

public class Book {
    private String title;
    private String author;
    private String contents;
    private int pages;
    private int publicationYear;
    private int id;

    public Book(String author, String bookTitle, int numberOfPages, int publicationYear) {
        this.author = author;
        this.title = bookTitle;
        this.pages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, int publicationYear) {
        this.id = id;
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public Book(String title, int publicationYear, String contents) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.contents = contents;
    }

    public String toString() {
        return this.title + " (" + this.publicationYear + ")\nContents: " + contents;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {return this.author;}

    public int getPages() {return this.pages;}

    public int getId() {return id;}

    public boolean equals(Object other){
        if (this == other) {
            return true;
        }

        if(!(other instanceof Book)) {
            return false;
        }

        Book bookOther = (Book) other;

        return author.equals(bookOther.author) && title.equals(bookOther.title) && pages == bookOther.pages && publicationYear == bookOther.publicationYear;

    }


}

class SortbyId implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getId() - b.getId();
    }
}
