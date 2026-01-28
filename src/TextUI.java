import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary book;

    public TextUI(Scanner scanner, SimpleDictionary book) {
        this.scanner = scanner;
        this.book = book;
    }

    public void start() {
        String input = "";
        while (true) {
            System.out.println("Enter a command: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (input.equalsIgnoreCase("add")) {
                addWord();
            } else if (input.equalsIgnoreCase("search")) {
                System.out.println(searchWord());
            } else {
                System.out.println("Unknown Command!");
            }
        }
    }

    public void addWord() {
        String englishWord = "";
        String chineseWord = "";

        System.out.println("Enter the English word: ");
        englishWord = scanner.nextLine();

        System.out.println("Enter the Chinese word: ");
        chineseWord = scanner.nextLine();

        book.add(englishWord, chineseWord);
    }

    public String searchWord() {
        String wordToQuery = "";
        String translated = "";
        System.out.println("Enter word to translate: ");
        wordToQuery = scanner.nextLine();

        translated = book.translate(wordToQuery);
        if (translated == null) { return "Word (" + wordToQuery + ") was not found.";}
        return translated;
    }
}
