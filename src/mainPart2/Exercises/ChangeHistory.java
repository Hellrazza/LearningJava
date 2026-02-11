import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(Double amount) {
        changes.add(amount);
    }

    public void clear() {
        changes.clear();
    }

    public String toString() {
        return changes.toString();
    }

    public double maxValue() {
        if (changes.isEmpty()) {return 0;}
        double largest = changes.getFirst();
        for (double change : changes) {
            if(change > largest) {
                largest = change;
            }
        }
        return largest;
    }

    public double minValue() {
        if (changes.isEmpty()) {return 0;}
        double smallest = changes.getFirst();
        for (double change : changes) {
            if (change < smallest) {
                smallest = change;
            }
        }
        return smallest;
    }

    public double average() {
        double sum = 0.0;
        for (double change : changes) {
            sum += change;
        }
        return sum / changes.size();
    }

}
