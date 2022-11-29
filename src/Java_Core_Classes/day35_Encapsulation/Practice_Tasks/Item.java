package Java_Core_Classes.day35_Encapsulation.Practice_Tasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty())
            return;

        for (int i = 0; i < name.length(); i++) {
            if (i == 0)
                if (!(Character.isLetter(name.charAt(i))))
                    return;
            else if (!(Character.isLetterOrDigit(name.charAt(i)) || Character.isSpaceChar(name.charAt(i))))
                return;
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0)
            return;
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            return;
        if (name!= null && name.equals("toilet paper"))
            this.quantity = 1;
        else this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalPrice=" + calcCost() +
                '}';
    }
}
