import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class WarehouseModification extends Warehouse{
    int section;
    int shelf;
    int number;

    public WarehouseModification() {
        super(new ArrayList<Product>());
        this.section = 1;
        this.shelf = 1;
        this.number = 1;
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

        System.out.print("Enter mass (kilograms, liters): ");
        double mass = scanner.nextDouble();
        scanner.nextLine();

        String place= String.valueOf(section+shelf+number);

        System.out.print("Enter comment: ");
        String comment = scanner.nextLine();

        int availableQuantity = 0;
        //След това преминава през всички съществуващи продукти в склада,
        // за да провери техните местоположения и дати на изтичане.
        for (Product product : products) {
            if (product.getName().equals(name) && product.getDueDate().equals(dueDate)) {
                availableQuantity++;
                System.out.println("Product added to existing location.");
                return;
            }
        }

        for (Product product : products) {
            if (product.getName().equals(name) && !(product.getDueDate().equals(dueDate))) {
                System.out.println("Product cannot be added to that location. Choose a new one");
                return;
            }
        }

        for (Product product : products) {
            if (product.getPlace().startsWith(section + "-" + shelf)) { //За всеки продукт се проверява дали местоположението на продукта започва с текущия раздел и рафт.
                if (product.getDueDate().equals(dueDate)) { //проверява дали продуктът има същия срок на годност като новия продукт.
                    number++; //Ако го направи, той увеличава числовата променлива, за да покаже, че има друг идентичен продукт на същото място
                    if (number > 5) {
                        shelf++;
                        number = 1;
                        if (shelf > 4) {
                            section++;
                            shelf = 1;
                            if (section > 8) {
                                System.out.println("No more space in warehouse. Product not added.");
                                return;
                            }
                        }
                    }
                } else {
                    shelf++;
                    number = 1;
                    if (shelf > 10) {
                        section++;
                        shelf = 1;
                        if (section > 10) {
                            System.out.println("No more space in warehouse. Product not added.");
                            return;
                        }
                    }
                }
            }
        }
        String newPlace = section + "-" + shelf + "-" + number;

        // Add the new product to the warehouse
        products.add(new Product(name, dueDate, entryDate, manufacturer, mass, availableQuantity, place, comment));
        System.out.println("Product added.");
    }

    public void removeProducts() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the product to remove: ");
        String name = scanner.nextLine();

        System.out.print("Enter the quantity to remove: ");
        double quantityToRemove = scanner.nextDouble();

        List<Product> matchingProducts = new ArrayList<>();

        // Find all matching products
        for (Product product : products) {
            if (product.getName().equals(name) && product.getAvailableQuantity() > 0) {
                matchingProducts.add(product);
            }
        }

        if (matchingProducts.isEmpty()) {
            System.out.println("No such products found in warehouse.");
            return;
        }

        matchingProducts.sort((p1, p2) -> p2.getDueDate().compareTo(p1.getDueDate()));//?

        double remainingQuantityToRemove = quantityToRemove;

        List<String> removedProductInfoList = new ArrayList<>();

        for (Product product : matchingProducts) {
            if (remainingQuantityToRemove <= 0) {
                break;
            }

            double quantityToRemoveFromProduct = Math.min(product.getAvailableQuantity(), remainingQuantityToRemove);

            product.availableQuantity -= quantityToRemoveFromProduct;
            remainingQuantityToRemove -= quantityToRemoveFromProduct;

            String removedProductInfo = quantityToRemoveFromProduct + " " + product.getMass() +
                    " of " + product.getName() + " removed from " + product.getPlace() +
                    " (expiry date: " + product.getDueDate() + ")";

            removedProductInfoList.add(removedProductInfo);

            if (product.getAvailableQuantity() == 0) {
                products.remove(product);
            }
        }

        if (remainingQuantityToRemove > 0) {
            System.out.println("Unable to remove " + remainingQuantityToRemove + " " +
                    " of " + name + ". Available quantities:");

            for (Product product : matchingProducts) {
                System.out.println("- " + product.getAvailableQuantity() + " " + product.getMass() +
                        " in " + product.getPlace() + " (expiry date: " + product.getDueDate() + ")");
            }

            System.out.print("Do you still want to remove the remaining quantity? (y/n): ");
            String answer = scanner.next();

            if (!answer.toLowerCase().equals("y")) {
                System.out.println("Product not removed.");
                return;
            }

            // Remove remaining quantity even if it exceeds available quantity
            for (Product product : matchingProducts) {
                if (remainingQuantityToRemove <= 0) {
                    break;
                }

                double quantityToRemoveFromProduct = Math.min(product.getAvailableQuantity(), remainingQuantityToRemove);

                product.availableQuantity -= quantityToRemoveFromProduct;
                remainingQuantityToRemove -= quantityToRemoveFromProduct;

                String removedProductInfo = quantityToRemoveFromProduct + " " + product.getMass() +
                        " of " + product.getName() + " removed from " + product.getPlace() +
                        " (expiry date: " + product.getDueDate() + ")";

                removedProductInfoList.add(removedProductInfo);

                if (product.getAvailableQuantity() == 0) {
                    products.remove(product);
                }
            }
        }

        // Print information about removed products
        System.out.println("Products removed from warehouse:");
        for (String removedProductInfo : removedProductInfoList) {
            System.out.println("- " + removedProductInfo);
        }
    }

}
