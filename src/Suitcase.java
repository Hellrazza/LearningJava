import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private final int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int getTotalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void addItem(Item item) {
        if(!items.contains(item)) {
            int totalWeight = getTotalWeight();
            if(totalWeight < maximumWeight && totalWeight + item.getWeight() < maximumWeight) {
                items.add(item);
            }
        }
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {return null;}

        Item currentHeaviest = items.getFirst();
        for (Item item : items) {
            if (currentHeaviest.getWeight() < item.getWeight()) {
                currentHeaviest = item;
            }
        }

        return currentHeaviest;
    }

    public String toString() {
        String item = "item";
        if (items.isEmpty()) { return "The suitcase is empty. (" + getTotalWeight() + "kg)";}
        if (items.size() > 1) {item = "items";}
        return items.size() + " " + item + " (" + getTotalWeight() + "kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
