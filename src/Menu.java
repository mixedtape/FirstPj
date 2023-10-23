// Menu.java
public class Menu {
    private String ProductName;
    private String ProductDescription;

    public Menu(String name, String description) {
        ProductName = name;
        ProductDescription = description;
    }

    public String getName() {
        return ProductName;
    }

    public String getDescription() {
        return ProductDescription;
    }
}
