public class ShopItem {
    private String name;
    private int quantity;
    private int price;

    public ShopItem(String product, int qty, int unitPrice) {
        name = product;
        quantity = qty;
        price = unitPrice;
    }

    public int getPrice() {
        return price * quantity;
    }

    public void increaseQuantity() {
        quantity++;
    }

    public String toString() {
        return name + ": " + quantity;
    }

}
