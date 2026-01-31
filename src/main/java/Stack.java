import java.util.ArrayList;

public class Stack {
    ArrayList<String> stackContents;

    public Stack() {
        stackContents = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackContents.isEmpty();
    }

    public void add(String value) {
        stackContents.add(value);
    }

    public ArrayList<String> values() {
        return new ArrayList<>(stackContents);
    }

    public String take() {
        return stackContents.removeLast();
    }
}
