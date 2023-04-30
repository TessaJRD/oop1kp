import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Warehouse{
    private static Warehouse instance;
    List<Product> products;

    private Warehouse()
    {
        products=new ArrayList<>();
    }

    public Warehouse(List<Product> products) {
        this.products = products;
    }

    public static Warehouse getInstance()
    {
        if(instance==null)
        {
            instance=new Warehouse();
        }
        return instance;
    }



}
