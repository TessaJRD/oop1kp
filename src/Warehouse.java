import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Warehouse {
    List<Product> products;

    public Warehouse() {
        this.products = new ArrayList<>();
    }

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter expiration date (YYYY-MM-DD): ");
        String dueDateString = scanner.nextLine();
        Date dueDate = null;
        try {
            dueDate = new SimpleDateFormat("yyyy-MM-dd").parse(dueDateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Product not added.");
            return;
        }
        System.out.print("Enter entry date (YYYY-MM-DD): ");
        String entryDateString = scanner.nextLine();
        Date entryDate = null;
        try {
            entryDate = new SimpleDateFormat("yyyy-MM-dd").parse(entryDateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Product not added.");
            return;
        }

        System.out.print("Enter manufacturer name: ");
        String manufacturer = scanner.nextLine();

        System.out.print("Enter unit of measurement (kilograms, liters): ");
        String unitOfMeasurement = scanner.nextLine();

        System.out.print("Enter availableQuantity: ");
        int availableQuantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter location: ");
        String location = scanner.nextLine();

        System.out.print("Enter comment: ");
        String comment = scanner.nextLine();

        for (Product product : products) {
            if (product.getName().equals(name) && product.getDueDate().equals(dueDate)) {
                product.getAvailableQuantity() += availableQuantity;
                System.out.println("Product added to existing location.");
                return;
            }
    }
}
