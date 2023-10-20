// Proxy: A proxy to access the online retail store
class OnlineRetailStoreProxy implements OnlineRetailStore {
    private RealOnlineRetailStore realStore;

    public OnlineRetailStoreProxy() {
        this.realStore = new RealOnlineRetailStore();
    }

    @Override
    public Product getProductDetails(String productId) {
        // Implement additional logic, such as caching or access control, here.
        return realStore.getProductDetails(productId);
    }
}