import java.util.Scanner;

public class Store {
    private ShopWarehouse warehouse;
    private Scanner scanner;

    public Store(ShopWarehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome " + customer);
        System.out.println("our selection: ");

        for (String product: this.warehouse.products()) {
            System.out.println(product);
        }

        while(true) {
            System.out.println("What to put in the cart (press enter to go to the register)");
            String product = scanner.nextLine();
            if(product.isEmpty()){
                break;
            }

            if (this.warehouse.stock(product) == 0) {
                System.out.println("Sorry this item is out of stock");
            }

            this.warehouse.take(product);
            cart.add(product, this.warehouse.price(product));
        }
    }
}
