import java.util.ArrayList;

public class PackableBox implements Packable {
    private ArrayList<Packable> items;
    private double maxCapacity;

    public PackableBox(double maxCapacity) {
        this.items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() > maxCapacity) {
            return;
        }
        items.add(item);
    }

    public double weight() {
        double sum = 0.0;
        for (Packable item : items) {
            sum += item.weight();
        }

        return sum;
    }

    public String toString(){
        return "Box: " + items.size() + " items, total weight: " + weight();
    }
}
