public class Bird {
    private String englishName;
    private String latinName;
    private int sightings;

    public Bird(String englishName, String latinName) {
        this.englishName = englishName;
        this.latinName = latinName;
        this.sightings = 0;
    }

    public void addSighting() {sightings++;}
    public String getEnglishName() {return englishName;}
    public String getLatinName() {return latinName;}
    public int getSightings() {return sightings;}

    public String toString() {
        return englishName + "(" +latinName + "): " + sightings + " observations.";
    }

}
