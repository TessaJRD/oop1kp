import java.util.Date;

public class Product {
    private String name;
    private Date dueDate;
    private Date entryDate;
    private String manufacturerName;
    private double mass;
    private int availableQuantity;
    private int place;
    private String comment;

    public Product(String name, Date dueDate, Date entryDate, String manufacturerName, double mass, int availableQuantity, int place, String comment) {
        this.name = name;
        this.dueDate = dueDate;
        this.entryDate = entryDate;
        this.manufacturerName = manufacturerName;
        this.mass = mass;
        this.availableQuantity = availableQuantity;
        this.place = place;
        this.comment = comment;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public double mass() {
        return mass;
    }

    public void name(String name) {
        this.name = name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
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

    public String name() {
        return name;
    }

    public void setProductMass(double productMass) {
        this.mass = mass;
    }
}
