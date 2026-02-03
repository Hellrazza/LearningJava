import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private HashMap<String, Book> directory;

    public Library() {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String bookTitle = sanitisedString(book.getTitle());
        if(directory.containsKey(bookTitle)) {
            System.out.println("Directory already contains book");
        } else {
            directory.put(bookTitle, book);
        }
    }

    public void removeBook(String bookTitle) {
        bookTitle = sanitisedString(bookTitle);

        if (directory.containsKey(bookTitle)) {
            directory.remove(bookTitle);
        } else {
            System.out.println("Cannot find book: " + bookTitle);
        }
    }

    public Book getBook(String bookTitle) {
        bookTitle = sanitisedString(bookTitle);
        return directory.get(bookTitle);
    }

    public String sanitisedString(String string) {
        if (string == null) {
            string = "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public ArrayList<Book> getBooksByPart(String titlePart) {
        titlePart = sanitisedString(titlePart);
        ArrayList<Book> books = new ArrayList<>();

        for (String bookTitle : directory.keySet()) {
            if(!bookTitle.contains(titlePart)) {
                continue;
            }
            books.add(directory.get(bookTitle));
        }
        return books;
    }

}
