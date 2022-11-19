package week11_11_19_2022.warmUp;

import java.time.LocalDate;

public class BMW {
    /*brand,model,color (String),      // BMW,x5,White
                - price,mileage (double)           // 20000,10000
                - year (int)                       // 2015
                - DOfB(LocalDate)                   // 2015,5,20
*/

    public String brand, model, color;
    public double price, mileage;
    public int year;
    public LocalDate DOfB;

    public BMW(String brand, String model, String color, double price, double mileage, int year, LocalDate DOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        this.year = year;
        this.DOfB = DOfB;
    }

    public String toString() {
        return "BWM{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year +
                ", DOfB=" + DOfB +
                '}';
    }

    public String getBrandName(){
        return brand;
    }



}
