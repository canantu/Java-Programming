package Java_Core_Classes.day33_Statics.Practice_Tasks;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;
    public static int numberOfWheels = 4;
    public static boolean hasBattery = true;
    public static boolean hasSeats = true;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public void drive(){
        System.out.println(brand + " " + model + " is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", numberOfWheels=" + numberOfWheels +
                ", hasBattery=" + hasBattery +
                ", hasSeats=" + hasSeats +
                '}';
    }
}
