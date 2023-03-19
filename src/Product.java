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

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public int getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(int entryDate) {
        this.entryDate = entryDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductMass(double productMass) {
        this.productMass = productMass;
    }
}
