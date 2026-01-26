public class HealthStation {
    private int totalWeighings;

    public HealthStation() {
        this.totalWeighings = 0;
    }


    public int weigh(Person person) {
        if (person == null) {
            return -1;
        }
        totalWeighings++;
        return person.getWeight();
    }

    public void feed(Person person) {
        if (person == null) {
            return;
        }
        person.gainWeight(1);
    }

    public int getTotalWeighings() {return totalWeighings;}
}
