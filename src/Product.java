import java.time.LocalDate;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="product")
public class Product implements ProductDescription{
    private String name;
    private Date dueDate;
    private Date entryDate;
    private String manufacturerName;
    private double mass;
    private int availableQuantity;
    private String place;
    private String comment;

    public Product(String name, Date dueDate, Date entryDate, String manufacturerName, double mass, int availableQuantity, String place, String comment) {
        this.name = name;
        this.dueDate = dueDate;
        this.entryDate = entryDate;
        this.manufacturerName = manufacturerName;
        this.mass = mass;
        this.availableQuantity = availableQuantity;
        this.place = place;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Product:" +
                "name='" + name + '\'' +
                ", dueDate=" + dueDate +
                ", entryDate=" + entryDate +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", mass=" + mass +
                ", availableQuantity=" + availableQuantity +
                ", place=" + place +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public String describeProduct() {
        return this.toString();
    }
}
