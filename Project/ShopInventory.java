import java.util.ArrayList;
import java.util.List;

public class ShopInventory {
    private List<Product> products = new ArrayList<>();

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("----- Product List -----");
            for (Product p : products) {
                System.out.println("Name: " + p.getName() + ", Quantity: " + p.getQuantity() + ", Price: $" + p.getPrice());
            }
        }
    }

    public void addProduct(String name, int quantity, double price) {
        products.add(new Product(name, quantity, price));
        System.out.println("Product added successfully.");
    }

    public boolean updateProduct(String name, int quantity, double price) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                p.setQuantity(quantity);
                p.setPrice(price);
                System.out.println("Product updated successfully.");
                return true;
            }
        }
        System.out.println("Product not found.");
        return false;
    }

    public boolean removeProduct(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }
}
