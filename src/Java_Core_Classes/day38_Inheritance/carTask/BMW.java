package Java_Core_Classes.day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW(String model, String color, int year, int miles, double price) {
        super("BMW", model, color, year, miles, price);
    }

    public void breakDown(){
        System.out.println(brand + model + " breaks down every 100 miles");
    }

    public void racing(){
        System.out.println(brand + model + " is racing");
    }

    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", miles=" + miles +
                ", price=" + price +
                '}';
    }
}
