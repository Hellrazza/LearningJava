import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BooksFromFile {
    public static List<StreamFileBook> readFromFile(String fileName) {
        List<StreamFileBook> books = new ArrayList<>();

        try {
            Files.lines(Paths.get(fileName)).map(row->row.split(",")).filter(parts -> parts.length >= 4)
                    .map(parts -> new StreamFileBook(parts[0],Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), parts[3]))
                    .forEach(books::add);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }
}
