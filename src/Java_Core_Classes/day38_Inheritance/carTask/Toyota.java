package Java_Core_Classes.day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, String color, int year, int miles, double price) {
        super("Toyota", model, color, year, miles, price);
    }

    @Override
    public void start(){
        System.out.println("Twist the key to ignition to start" + brand + " " + model);
    }
    public void reliable(){
        System.out.println(brand + model + " is reliable");
    }

    public String toString() {
        return "Toyota{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
