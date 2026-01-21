import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
    private String name;
    private String timeCreated;

    public Item(String name) {
        this.name = name;
        this.timeCreated = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date());
    }

    public String toString() {
        return this.name + "(Created at: " + this.timeCreated + ")";
    }
}
