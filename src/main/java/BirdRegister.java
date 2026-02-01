import java.util.ArrayList;

public class BirdRegister {
    private ArrayList<Bird> birds;

    public BirdRegister() {
        this.birds = new ArrayList<>();
    }

    public boolean addBird(String birdEnglishName, String birdLatinName) {
        for (Bird bird : birds) {
            if (bird.getEnglishName().equals(birdEnglishName) && bird.getLatinName().equals(birdLatinName)) {
                return false;
            }
        }

        birds.add(new Bird(birdEnglishName, birdLatinName));
        return true;
    }

    public boolean addObservation(String birdName) {
        for (Bird bird : birds) {
            if (bird.getEnglishName().equals(birdName) || bird.getLatinName().equals(birdName)) {
                bird.addSighting();
                return true;
            }
        }
        return false;
    }

    public ArrayList<Bird> getBirds() {return birds;}

    public Bird findBirdByName(String birdName) {
        for (Bird bird : birds) {
            if (bird.getEnglishName().equals(birdName) || bird.getLatinName().equals(birdName)) {
                return bird;
            }
        }
        return null;
    }
}
