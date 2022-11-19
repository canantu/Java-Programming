package Java_Core_Classes.day31_Constructors.PracticeTasks;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }


    public double calcCost(){
        return isPersian? (width * length) * unitPrice + 200: (width * length) * unitPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price=" + calcCost() +
                '}';
    }
}
/*
instance variables:
width, length, unitPrice, isPersian (boolean)
 */