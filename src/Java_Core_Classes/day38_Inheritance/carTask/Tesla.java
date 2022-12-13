package Java_Core_Classes.day38_Inheritance.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }
    @Override
    public void start(){
        System.out.println("Call start");
    }
    public void autoPilot(){
        System.out.println(brand + model + " is auto-piloting");
    }

    public String toString() {
        return "Tesla{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
