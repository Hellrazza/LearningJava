import java.util.Scanner;

public class UserInterface {
    private WordSet wordSet;
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        wordSet = new WordSet();
    }

    public void start() {

        while (true) {
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            if (wordSet.alreadyEntered(word)) {
                break;
            }
            wordSet.add(word);
            System.out.println(word + " is a palindrome? " + wordSet.isPalindrome(word));
        }

        System.out.println("You entered the same word twice!");

        System.out.println(wordSet);
    }
}
