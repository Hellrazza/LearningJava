import java.util.ArrayList;

public class SimpleCollection {
    private ArrayList<String> contents;
    private int numberOfElements;
    private String collectionName;

    public SimpleCollection(String collectionName) {
        this.contents = new ArrayList<>();
        this.numberOfElements = 0;
        this.collectionName = collectionName;
    }

    public void add(String content) {
        if(!contents.contains(content)) {
            contents.add(content);
            numberOfElements++;
        }
    }

    public String longest() {
        if (contents.isEmpty()) {return null;}
        String currentLongest = contents.get(0);

        for (String content : contents) {
            if (currentLongest.length() < content.length()) {
                currentLongest = content;
            }
        }

        return currentLongest;
    }

    public String toString() {
        String stringOutput = "The collection " + collectionName + " ";

        if (contents.isEmpty()) {return stringOutput + "is empty.";}

        stringOutput = stringOutput + "has " + numberOfElements + " elements: ";
        for (String item : contents) {
            stringOutput = stringOutput + "\n" + item;
        }

        return stringOutput;
    }
}
