import java.util.HashMap;
import java.util.Map;

public class ProxyPatternExample {
    public static void main(String[] args) {
        OnlineRetailStore store = new OnlineRetailStoreProxy();

        // Simulate a customer's request to get product details
        String productId = "123";
        Product product = store.getProductDetails(productId);

        if (product != null) {
            System.out.println("Product Details:");
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Price: $" + product.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }
}