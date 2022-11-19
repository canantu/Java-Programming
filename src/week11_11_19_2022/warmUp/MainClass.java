package week11_11_19_2022.warmUp;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        BMW car1 = new BMW("bmw", "i1", "black", 10000, 30000, 2015, LocalDate.of(2015, 8, 16));
        BMW car2 = new BMW("bmw", "i8", "white", 25000, 130000, 2019, LocalDate.of(2019, 8, 16));
        BMW car3 = new BMW("bmw", "i3", "red", 15000, 300000, 2013, LocalDate.of(2013, 8, 16));
        BMW car4 = new BMW("bmw", "i8", "gray", 35000, 730000, 2012, LocalDate.of(2012, 8, 16));

        System.out.println(car1.getBrandName());

        ArrayList<BMW> carList = new ArrayList<>(Arrays.asList(car1,car2,car3,car4));

        for (BMW each : carList) {
            if (each.year < 2017 && each.model == "i8")
                System.out.println(each);
        }
    }
}
