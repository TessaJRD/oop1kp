import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse=Warehouse.getInstance();
        WarehouseModification modification= new WarehouseModification();

        while(true){
            System.out.println("----------------------\n"+
                    "1. Open file"+"\n"+
                    "2. Save file"+"\n"+
                    "3. Save file as"+"\n"+
                    "4. Close file"+"\n"+
                    "5. Help"+"\n"+
                    "6. Add product"+"\n"+
                    "7. Remove product"+"\n"+
                    "8. Log report"+"\n"+
                    "9. Clean warehouse"+"\n"+
                    "10. Exit"+"\n");
            System.out.println("Choose an option!");
            Scanner scanner=new Scanner(System.in);
            int chosenOption= scanner.nextInt();

            switch (chosenOption){
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
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;

            }
        }
    }
}