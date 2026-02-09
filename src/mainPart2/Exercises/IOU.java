import java.util.HashMap;

public class IOU {
    HashMap<String, Double> moneyOwnHash;
    public IOU() {
        moneyOwnHash = new HashMap<>();
    }

    public void addIOU(String person, Double amount) {
        moneyOwnHash.put(person, amount);
    }

    public Double howMuchDoIOwe(String person) {
        return moneyOwnHash.getOrDefault(person, 0.0);
    }

}
