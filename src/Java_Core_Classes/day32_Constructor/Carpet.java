package Java_Core_Classes.day32_Constructor;

public class Carpet {

    public double width, length, unitPrice;  //public variables are accessible from all packages in the project
    public boolean isPersian;

    //constructor is used to set the instances

    //Constructor must have the same name as Classname
    public Carpet(double width, double length, double unitPrice, boolean isPersian){
        this.width = width;  //this keyword points out the instance variable
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    //without toString() I can not print the object only hashcode
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + calcCost() +
                '}';
    }

    public double calcCost(){
        double totalPrice = (width * length) * unitPrice;
        if (isPersian)
            totalPrice += 200;

        return totalPrice;
    }
}
