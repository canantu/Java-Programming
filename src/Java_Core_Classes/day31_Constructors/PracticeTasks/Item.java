package Java_Core_Classes.day31_Constructors.PracticeTasks;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*
Attributes:
name, unitPrice, quantity
calcCost(): returns the total price of the Item
toString(): returns the name, unitPrice, quantity and total
Price that's calculated by calcCost()
 */