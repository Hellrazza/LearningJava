import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private final ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void add(String joke) {

        jokes.add(joke);
    }

    public void drawJoke() {
        if (jokes.isEmpty()) {
            System.out.println("Jokes are in short supply.");
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            System.out.println(jokes.get(index));
        }
    }

    public void listJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
