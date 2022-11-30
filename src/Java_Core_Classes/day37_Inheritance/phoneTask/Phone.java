package Java_Core_Classes.day37_Inheritance.phoneTask;

public class Phone {

    public String brand, model, color;
    public int size;
    public double price;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String color, int size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }
}
