import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translations = dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        if(dictionary.containsKey(word)) {return dictionary.get(word);}
        return new ArrayList<String>();
    }

    public void remove(String word) {
        dictionary.remove(word);
    }
}
