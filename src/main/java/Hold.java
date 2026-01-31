import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (getTotalWeight() < maximumWeight && getTotalWeight() + suitcase.getTotalWeight() < maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.getTotalWeight();
        }
        return totalWeight;
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + getTotalWeight() + "kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
