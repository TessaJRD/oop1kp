import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseConsolePrinter extends Warehouse implements WarehousePrinter{

    public WarehouseConsolePrinter() {
        super(new ArrayList<Product>());
    }

    @Override
    public void printCleanedProducts() {
        List<Product> expiredProducts = new ArrayList<>();
        List<Product> expiringSoonProducts = new ArrayList<>();

        for (Product product : expiredProducts) {
            products.remove(product);
            System.out.println("Removed expired product: " + product.getName() + " (" + product.getPlace() + ")");
        }

        for (Product product : expiringSoonProducts) {
            System.out.println("Product expiring soon: " + product.getName() + " (" + product.getPlace() + ")");
        }
    }

    @Override
    public void printAllProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " (" + product.getAvailableQuantity() + " " + product.getMass()
                    + ") in " + product.getPlace() + " (expiry date: " + product.getDueDate() + ")");
        }
    }
}
