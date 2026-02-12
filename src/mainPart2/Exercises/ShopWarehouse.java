import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShopWarehouse {
    private final Map<String, Integer> products;
    private final Map<String, Integer> productsStock;

    public ShopWarehouse() {
        this.products = new HashMap<>();
        this.productsStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        products.put(product, price);
        productsStock.put(product, stock);
    }

    public int price(String product) {
        if (products.containsKey(product)) {
            return products.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (productsStock.containsKey(product)) {
            return productsStock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (!productsStock.containsKey(product)) return false;
        if (productsStock.get(product) == 0) return false;
        productsStock.put(product, productsStock.get(product)-1);
        return true;
    }

    public Set<String> products() {
        Set<String> productList = new HashSet<>();
        for (String product : products.keySet()) {
            productList.add(product);
        }
        return productList;
    }

}
