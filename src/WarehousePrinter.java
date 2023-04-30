import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class WarehousePrinter extends Warehouse{
    public WarehousePrinter(List<Product> products) {
        super(products);
    }

    public void clean() {
        List<Product> expiredProducts = new ArrayList<>();
        List<Product> expiringSoonProducts = new ArrayList<>();

        LocalDate today = LocalDate.now();

        for (Product product : products) {
            if (product.getDueDate().isBefore(today)) {
                expiredProducts.add(product);
            } else if (product.getDueDate().minusDays(30).isBefore(today)) {
                expiringSoonProducts.add(product);
            }
        }

        for (Product product : expiredProducts) {
            products.remove(product);
            System.out.println("Removed expired product: " + product.getName() + " (" + product.getPlace() + ")");
        }

        for (Product product : expiringSoonProducts) {
            System.out.println("Product expiring soon: " + product.getName() + " (" + product.getPlace() + ")");
        }

        if (expiredProducts.isEmpty() && expiringSoonProducts.isEmpty()) {
            System.out.println("No products to clean.");
        }
    }
}
