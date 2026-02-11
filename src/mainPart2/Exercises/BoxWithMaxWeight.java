import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private int capacityUsed;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (capacityUsed + item.getWeight() > capacity) {
            return;
        }

        capacityUsed += item.getWeight();
        items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }


}
