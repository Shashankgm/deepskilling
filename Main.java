import java.util.HashMap;

public class Main{
    private static final HashMap<Integer, Product> inventory = new HashMap<>();

    public static void addProduct(Product product) {
        inventory.put(product.productid, product);
        System.out.println("Product added.");
    }

    public static void updateProduct(int id, int quantity, double price) {
        if (inventory.containsKey(id)) {
            Product p = inventory.get(id);
            p.quantity = quantity;
            p.price = price;
            System.out.println(" updated.");
        } else {
            System.out.println("not found.");
        }
    }

    public static void deleteProduct(int id) {
        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println(" deleted.");
        } else {
            System.out.println(" not found.");
        }
    }

    public static void showInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        addProduct(new Product(101, "Monitor", 10, 999.98));
        addProduct(new Product(102, "Keyboard", 25, 499.5));

        showInventory();

        updateProduct(101, 12, 9500.00);
        deleteProduct(102);

        System.out.println("\nInventory After Updates:");
        showInventory();
    }
}


