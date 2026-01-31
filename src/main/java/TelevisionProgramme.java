public class TelevisionProgramme {
    private String name;
    private int duration;

    public TelevisionProgramme(String programmeName, int durationInMinutes) {
        this.name = programmeName;
        this.duration = durationInMinutes;
    }

    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }

    public int getDuration() {
        return this.duration;
    }
}
