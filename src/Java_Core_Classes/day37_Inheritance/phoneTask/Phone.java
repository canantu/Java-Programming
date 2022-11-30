package Java_Core_Classes.day37_Inheritance.phoneTask;

public class Phone {

    public String brand, model, color, size;
    public double price;

    public static boolean hasBattery;

    public Phone(String brand, String model, String color, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    static {
        hasBattery = true;
    }
    public void call(long phoneNumber){
        System.out.println(brand + "-" + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + "-" + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                '}';
    }
}
