import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> entities;

    public Herd() {
        entities = new ArrayList<>();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(Movable entity : entities) {
            stringBuilder.append(entity.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void addToHerd(Movable entity) {
        entities.add(entity);
    }

    public void move(int dx, int dy) {
        for (Movable entity : entities) {
            entity.move(dx, dy);
        }
    }
}
