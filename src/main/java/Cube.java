public class Cube {
    private int edge_length;

    public Cube(int edgeLength) {
        this.edge_length = edgeLength;
    }

    public int volume() {
        return edge_length * edge_length * edge_length;
    }

    public String toString() {
        return "The length of the edge is " + this.edge_length + " and the volume is " + volume();
    }
}
