import java.util.ArrayList;
import java.util.Collections;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(123,"Call of Cthulhu"));
        books.add(new Book(10, "Ghost Rider 2099"));
        books.add(new Book(4, "Bart Simpson's Guide to Life"));

       SearchingAlgorithms.binarySearch(books, 1);
    }

    public static int linearSearch(ArrayList<Book> books, int searchId) {
        int index = 0;

        while (index < books.size()) {
            if (books.get(index).getId() == searchId) {
                return index;
            }
            index++;
        }
        return  -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchId) {
        Collections.sort(books, new SortbyId());

        int end = books.size() - 1;
        int begin = 0;

        while (begin < end) {
            int mid = (begin + end) / 2;

            if (books.get(mid).getId() == searchId) { return mid;}

            if(books.get(mid).getId() > searchId) {
                end = mid - 1;
            }

            if (books.get(mid).getId() < searchId) {
                begin = mid + 1;
            }
        }

        return -1;
    }
}
