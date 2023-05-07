import java.util.Date;

public class ProductFactory {
    public ProductDescription createProduct(String type, String name, Date dueDate, Date entryDate,
                                            String manufacturerName, double mass, int availableQuantity, String place, String comment){
        ProductDescription product;
        if(type=="Potato"){
            product=new Potato(name,dueDate,entryDate,manufacturerName,mass,
                    availableQuantity,place,comment);
        }else{
            throw new IllegalArgumentException("Such products cannot be added to this Warehouse!");
        }
        return product;
    }
}
