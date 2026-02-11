import java.util.Objects;

public class WarehouseWithProductHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;

    public WarehouseWithProductHistory(String name, double capacity, double capacityUsed) {
        super(name, capacity);
        super.addToWarehouse(capacityUsed);
        changeHistory = new ChangeHistory();
        changeHistory.add(capacityUsed);
    }

    public String history() {
        return changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount) {;
        super.addToWarehouse(amount);
        changeHistory.add(super.getCapacityUsed());
    }

    @Override
    public double removeFromWarehouse(double amount) {
        amount = super.removeFromWarehouse(amount);
        changeHistory.add(super.getCapacityUsed());
        return amount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() +
                "\nHistory: " + history() +
                "\nLargest Amount of Product: " + changeHistory.maxValue() +
                "\nSmallest Amount of Product: " + changeHistory.minValue() +
                "\nAverage Amount of Product: " + changeHistory.average());
    }
}
