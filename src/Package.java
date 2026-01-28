import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    private int totalWeight;

    public Package() {
        gifts = new ArrayList<>();
        totalWeight = 0;
    }

    public void addGift(Gift gift) {
        if(!gifts.contains(gift)) {
            gifts.add(gift);
            totalWeight += gift.getWeight();
        }
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
