public class Warehouse {
    private final double totalCapacity;
    private double capacityUsed;

    public Warehouse(double totalCapacity) {
        if(totalCapacity <= 0) {
            totalCapacity = 0;
        }

        this.totalCapacity = totalCapacity;

    }

    public double getCapacityUsed() {return capacityUsed;}
    public double getTotalCapacity() {return totalCapacity;}


    public double remainingSpace() {
        return totalCapacity - capacityUsed;
    }

    public void addToWarehouse(double amount) {
        if (amount <= 0) {return;}
        if (capacityUsed + amount > totalCapacity) {
            capacityUsed = totalCapacity;
        } else {
            capacityUsed += amount;
        }
    }

    public double removeFromWarehouse(double amount) {
        if (amount <= 0) {return 0.0;}
        if (capacityUsed - amount <= 0) {
            double toTake = capacityUsed;
            capacityUsed = 0;
            return toTake;
        }

        capacityUsed -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "Total Capacity Used: " + capacityUsed + "\nRemaining Space: " + remainingSpace();
    }
}
