package Java_Core_Classes.day43_Abstraction.car;

public class CarShop {
    public static void main(String[] args) {

       // Car car = new Car();  abstract classes can not be instantiated, they are not concrete

        Honda  car1 = new Honda("Accord", "white", 2019, 20000);
        Tesla car2 = new Tesla("Model3", "black", 2021, 45000);
        Audi car3 = new Audi("Q7", "red", 2020, 35000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println("------------------------------------");

        car1.setColor("pink");
        car2.setColor("yellow");
        car3.setColor("brown");


    }
}
