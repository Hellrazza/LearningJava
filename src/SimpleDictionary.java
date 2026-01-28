import java.util.ArrayList;

public class SimpleDictionary {
    private ArrayList<EnglishToChineseWord> wordList;

    public SimpleDictionary() {
        wordList = new ArrayList<>();
    }

    public void add(String english, String chinese) {
        EnglishToChineseWord word = new EnglishToChineseWord(english, chinese);
        if(!wordList.contains(word)) {
            wordList.add(word);
        }
    }

    public String translate(String word) {
        // I would use hash map for this in a more advanced project.
        for ( EnglishToChineseWord english : wordList) {
            if (english.getEnglish().equals(word)) {
                return english.getChinese();
            }
        }

        for (EnglishToChineseWord chinese : wordList) {
            if (chinese.getChinese().equals(word)) {
                return chinese.getEnglish();
            }
        }

        return null;
    }

}
