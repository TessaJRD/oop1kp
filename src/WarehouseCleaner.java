import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseCleaner extends Warehouse{
    List<Product> expiredProducts = new ArrayList<>();
    List<Product> expiringSoonProducts = new ArrayList<>();

    public WarehouseCleaner(List<Product> products, List<Product> expiredProducts, List<Product> expiringSoonProducts) {
        super(products);
        this.expiredProducts = expiredProducts;
        this.expiringSoonProducts = expiringSoonProducts;
    }

    public void cleanWarehouse(){

        Date today = new Date();

        for (Product product : products) {
            if (product.getDueDate().before(today)) {
                expiredProducts.add(product);
            } else if (product.getDueDate().before(new Date(today.getTime() + 30 * 24 * 60 * 60 * 1000))) {
                expiringSoonProducts.add(product);
            }
        }

        if (expiredProducts.isEmpty() && expiringSoonProducts.isEmpty()) {
            System.out.println("No products to clean.");
        }
    }
}
