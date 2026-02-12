public class Organism implements Movable{
    private int xPos;
    private int yPos;

    public Organism(int x, int y) {
        xPos = x;
        yPos = y;
    }

    public String toString() {
        return "x: " + xPos + ", y: " + yPos;
    }

    public void move(int dx, int dy) {
        xPos += dx;
        yPos += dy;
    }

}
