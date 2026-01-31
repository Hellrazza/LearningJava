import java.util.ArrayList;

public class Room {
    ArrayList<Individual> individuals;

    public Room() {
        individuals = new ArrayList<>();
    }

    public void add(Individual individual) {
        if(!individuals.contains(individual)) {
            individuals.add(individual);
        }
    }

    public Individual shortest() {
        if (isEmpty()) { return null;}

        Individual currentShortest = individuals.get(0);

        for (Individual individual : individuals) {
            if (currentShortest.getHeight() > individual.getHeight()) {
                currentShortest = individual;
            }
        }

        return currentShortest;
    }

    public Individual take() {
        Individual shortestPerson = shortest();
        individuals.remove(shortestPerson);
        return shortestPerson;
    }

    public boolean isEmpty() {
        return individuals.isEmpty();
    }

    public ArrayList<Individual> getIndividuals() {
        return new ArrayList<>(individuals);
    }
}
