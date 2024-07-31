public class Test{
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 25, 499.99);
        Product product3 = new Product("P003", "Tablet", 15, 299.99);

        inventoryManager.addProduct(product1);
        inventoryManager.addProduct(product2);
        inventoryManager.addProduct(product3);

        System.out.println("Product P001: " + inventoryManager.getProduct("P001").getProductName());

        Product updatedProduct1 = new Product("P001", "Gaming Laptop", 8, 1299.99);
        inventoryManager.updateProduct("P001", updatedProduct1);

        System.out.println("Updated Product P001: " + inventoryManager.getProduct("P001").getProductName() + " - $" + inventoryManager.getProduct("P001").getPrice());

        inventoryManager.deleteProduct("P002");

        Product deletedProduct = inventoryManager.getProduct("P002");
        if (deletedProduct == null) {
            System.out.println("Product P002 has been deleted.");
        }
    }
}
