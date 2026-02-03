import java.util.HashMap;

public class Abbreviations {
    HashMap<String, String> translator;

    public Abbreviations() {
        translator = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        translator.put(sanitiseString(abbreviation), sanitiseString(explanation));
    }

    public boolean hasAbbreviation(String abbreviation) {
        return translator.containsKey(sanitiseString(abbreviation));
    }

    public String findExplanationFor (String abbreviation) {
        return translator.get(sanitiseString(abbreviation));
    }



    public String sanitiseString(String string) {
        if (string == null) {
            string = "";
        }

        string = string.toLowerCase();
        return string.trim();
    }
}
