public class Product {
    int productid;
    String productname;
    int quantity;
    double price;

    public Product(int productid, String productname, int quantity, double price) {
        this.productid = productid;
        this.productname = productname;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product iD: " + productid +
               ", Name: " + productname +
               ", Quantity: " + quantity +
               ", Price: Rs." + price;
    }
}
