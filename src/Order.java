// Order.java
import java.util.ArrayList;

public class Order {
    private ArrayList<Product> cart = new ArrayList<>();

    public void ProductAdd(Product product) {
        cart.add(product);
    }

    public void clear() {
        cart.clear();
    }

    public int calculateTotal() {
        int total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }


    public ArrayList<Product> getCart() {
        return cart;
    }
}
