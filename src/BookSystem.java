import java.util.ArrayList;
import java.util.Scanner;

public class BookSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        String bookName = "";
        String authorName = "";
        int numberOfPages = 0;
        int publicationYear = 0;

        while (true) {
            System.out.println("Enter Author Name: ");
            authorName = scanner.nextLine();

            if(authorName.isEmpty()) break;

            System.out.println("Enter Book Name: ");
            bookName = scanner.nextLine();

            System.out.println("Enter number of pages: ");
            numberOfPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter publication year: ");
            publicationYear = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(authorName, bookName, numberOfPages, publicationYear));
        }

        System.out.println("What would you like to display (Title or Everything): ");
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("Title")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }
        } else if (input.equalsIgnoreCase("Everything")) {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
    }
}
