public class Product {
    private String productName;
    private int dueDate;
    private int entryDate;
    private String manufacturerName;
    private double productMass;
    private int availableQuantity;
    private String comment;

    public void Product(String productName,int dueDate, int entryDate, String manufacturerName, double productMass,int availableQuantity, String comment)
    {
        this.productName=productName;
        this.dueDate=dueDate;
        this.entryDate=entryDate;
        this.manufacturerName=manufacturerName;
        this.productMass=productMass;
        this.availableQuantity=availableQuantity;
        this.comment=comment;
    }

    public double getProductMass() {
        return productMass;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
