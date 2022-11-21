package Java_Core_Classes.day32_Constructor;

public class Car {

    public String brand;
    public String model;
    public int year;
    public double price;
    public String color;

    //first constructor
    public Car(String brand){
        this.brand = brand;
    }
    //2nd constructor
    public Car(String brand, String model){
        this(brand);
        this.model = model;
    }
    //3rd constructor
    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
    }
    //4th constructor
    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
        this.price = price;
    }
    // 5th constructor
    public Car(String brand, String model, int year, double price, String color){
        this(brand, model, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
