import java.util.ArrayList;

public class WordSet {
    private final ArrayList<String> wordList;

    public WordSet() {
        wordList = new ArrayList<>();
    }

    public void add(String word) {
        wordList.add(word);
    }

    public boolean alreadyEntered(String word) {
        return wordList.contains(word);
    }

    public String toString() {
        String output = "";
        for (String word : wordList) {
            output = output + word + "\n";
        }

        return output;
    }

    public boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
