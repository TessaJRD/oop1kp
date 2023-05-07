import java.util.Scanner;

public class MenuHandler {

    WarehouseModification modification= new WarehouseModification();
    WarehouseConsolePrinter printer=new WarehouseConsolePrinter();
    public void showMenuOptions() {
        System.out.println("----------------------\n" +
                "1. Open file" + "\n" +
                "2. Save file" + "\n" +
                "3. Save file as" + "\n" +
                "4. Close file" + "\n" +
                "5. Help" + "\n" +
                "6. Add product" + "\n" +
                "7. Remove product" + "\n" +
                "8. Print products" + "\n" +
                "9. Log report" + "\n" +
                "10. Clean warehouse" + "\n" +
                "11. Exit" + "\n");
        System.out.println("Choose an option!");
    }

    public void choiceHandler() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int chosenOption = scanner.nextInt();

            switch (chosenOption) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:

                    modification.addProduct();

                    break;
                case 7:
                    modification.removeProducts();
                    break;
                case 8:
                    printer.printAllProducts();
                    break;
                case 9:
                    printer.printCleanedProducts();
                    break;
                case 10:
                    break;

            }
        }
    }

}
