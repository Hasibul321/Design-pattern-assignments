import java.util.HashMap;
import java.util.Map;

// RealSubject: The actual online retail store implementation
class RealOnlineRetailStore implements OnlineRetailStore {
    private Map<String, Product> productInventory;

    public RealOnlineRetailStore() {
        productInventory = new HashMap<>();
        // Initialize the product inventory with some products
        productInventory.put("123", new Product("123", "Product A", 100.0));
        productInventory.put("456", new Product("456", "Product B", 75.0));
    }

    @Override
    public Product getProductDetails(String productId) {
        return productInventory.get(productId);
    }
}