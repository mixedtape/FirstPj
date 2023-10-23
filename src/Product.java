// Product.java
public class Product extends Menu {
    private int Productprice;


    public Product(String name, String description, int price) {
        super(name, description);
        Productprice = price;
    }

    public int getPrice() {
        return Productprice;
    }
}
