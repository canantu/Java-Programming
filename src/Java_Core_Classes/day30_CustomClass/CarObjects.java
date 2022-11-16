package Java_Core_Classes.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);

        car1.setInfo("BMW", "335is", "black", 2020, 45000);
        System.out.println(car1);
        car1.start();
        car1.drive();
        car1.stop();

        Car car2 = new Car();
        car2.setInfo("Toyota", "Camry", "white", 2021, 35000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "red", 2019, 40000);
        System.out.println(car3);

        //Car[] cars = {car1, car2, car3}; arrays do not allow add or remove elements, not efficient

        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(car1, car2, car3)); //convert objects into collection type

        for (Car each : carsList) {
            System.out.println(each.brand + ": " + each.price);
        }
        System.out.println("---------------------------------------------");

        /*
        Recall:
            BMW: 2005 - 2008
            Toyota : 1995 - 1997
         */

        carsList.removeIf(p-> p.brand == "BMW" && p.year >=2005 && p.year<=2008);
        carsList.removeIf(p-> p.brand == "Toyota" && p.year >=1995 && p.year<=1997);


    }
}
