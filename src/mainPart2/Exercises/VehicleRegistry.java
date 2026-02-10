import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private final HashMap<LicensePlate, String> drivers;

    public VehicleRegistry() {
        this.drivers = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if(!drivers.containsKey(licensePlate) || drivers.get(licensePlate).isEmpty()) {
            drivers.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return drivers.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (drivers.containsKey(licensePlate)) {
            drivers.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : drivers.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : drivers.values()) {
            if(!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }

}
