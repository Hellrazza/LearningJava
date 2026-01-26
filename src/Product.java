public class Product {
    private double price;
    private int quantity;
    private String name;
    private String location;
    private int weight;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name) {
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }

    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight = 1;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
    }

    public void printProduct() {
        System.out.println(name + ", £" + price +", " + quantity +" pcs");
    }

    public String toString() {
        return name + " (" + weight + "kg) can be found from the " + location;
    }
}
