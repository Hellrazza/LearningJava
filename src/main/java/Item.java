import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
    private String name;
    private int weight;
    private String timeCreated;

    public Item(String name) {
        this.name = name;
        this.timeCreated = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
    }

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {return name;}
    public int getWeight() {return weight;}


    public String toString() {
        return name + " (" + weight + "kg)";
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) { return true;}
        
        if(!(other instanceof Item)) {return false;}

        Item otherItem = (Item) other;

        return this.name.equals(otherItem.name);
    }

    @Override
    public int hashCode() {
        if (name.isEmpty()) {
            name = " ";
        }
        return name.length();
    }



}
