import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
    private String name;
    private int weight;
    private String timeCreated;

    public Item(String name) {
        this.name = name;
        this.timeCreated = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {return name;}
    public int getWeight() {return weight;}


    public String toString() {
//        if (this.weight.exists)
//        return this.name + "(Created at: " + this.timeCreated + ")"; commented out for other task.
        return name + " (" + weight + "kg)";
    }
}
