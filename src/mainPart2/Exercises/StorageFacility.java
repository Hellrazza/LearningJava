import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String, ArrayList<String>> inventory;

    public StorageFacility() {
        this.inventory = new HashMap<>();
    }

    public void add(String unit, String item) {
        inventory.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> items = inventory.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String unit) {
        if(inventory.containsKey(unit)) {
            return inventory.get(unit);
        }
        return new ArrayList<String>();
    }

    public void remove(String unit, String item) {
        if(inventory.containsKey(unit)) {
            ArrayList<String> items = inventory.get(unit);
            items.remove(item);
            if (items.isEmpty()) {
                inventory.remove(unit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : inventory.keySet()) {
            units.add(unit);
        }
        return units;
    }
}
