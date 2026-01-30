import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SearchAlgorithmsTest {

    @Test
    public void foundBookLinear() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(123,"Call of Cthulhu"));
        books.add(new Book(10, "Ghost Rider 2099"));
        books.add(new Book(4, "Bart Simpson's Guide to Life"));

        assertEquals(0, SearchingAlgorithms.linearSearch(books,123));
    }

    @Test
    public void didNotFindBookLinear() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(123,"Call of Cthulhu"));
        books.add(new Book(10, "Ghost Rider 2099"));
        books.add(new Book(4, "Bart Simpson's Guide to Life"));

        assertEquals(-1, SearchingAlgorithms.linearSearch(books, 16));
    }

    @Test
    public void foundBookBinary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(4,"Call of Cthulhu"));
        books.add(new Book(5, "Ghost Rider 2099"));
        books.add(new Book(6, "Bart Simpson's Guide to Life"));
        books.add(new Book(1, "Iron Man"));
        books.add(new Book(2, "Weapon X"));

        books.sort(new SortbyId());

        for (Book book : books) {
            System.out.println(book.getTitle() + ":" + book.getId());
        }

        assertEquals(3, SearchingAlgorithms.binarySearch(books, 5));
    }

    @Test
    public void didNotFindBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(4,"Call of Cthulhu"));
        books.add(new Book(5, "Ghost Rider 2099"));
        books.add(new Book(6, "Bart Simpson's Guide to Life"));
        books.add(new Book(1, "Iron Man"));
        books.add(new Book(2, "Weapon X"));

        assertEquals(-1, SearchingAlgorithms.binarySearch(books, 7));
    }
}
