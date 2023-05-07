import java.util.Date;

public class Potato extends Product{

    public Potato(String name, Date dueDate, Date entryDate, String manufacturerName, double mass, int availableQuantity, String place, String comment) {
        super(name, dueDate, entryDate, manufacturerName, mass, availableQuantity, place, comment);
    }

    @Override
    public String toString() {
        return "Potato:" +
                "name='" + super.getName() + '\'' +
                ", dueDate=" + super.getDueDate() +
                ", entryDate=" + super.getEntryDate() +
                ", manufacturerName='" + super.getManufacturerName() + '\'' +
                ", mass=" + super.getMass() +
                ", availableQuantity=" + super.getAvailableQuantity() +
                ", place=" + super.getPlace() +
                ", comment='" + super.getComment() + '\'' +
                '}';
    }

    @Override
    public String describeProduct() {
        return this.toString();
    }
}
