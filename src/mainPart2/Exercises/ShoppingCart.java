import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, ShopItem> cartContents;

    public ShoppingCart() {
        cartContents = new HashMap<>();
    }

    public void add(String product, int price) {
        if (cartContents.containsKey(product)) {
            ShopItem item = cartContents.get(product);
            item.increaseQuantity();
        } else {
            cartContents.put(product, new ShopItem(product, 1, price));
        }
    }

    public int price() {
        int sum = 0;
        for(ShopItem item : cartContents.values()) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void print() {
        for(ShopItem item : cartContents.values()) {
            System.out.println(item);
        }
    }



}
