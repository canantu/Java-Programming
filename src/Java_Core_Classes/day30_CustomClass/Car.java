package Java_Core_Classes.day30_CustomClass;
//we create the template of the object, so we don't insert a main class inside custom class
public class Car {

    public String brand;
    public String model; //we need separate copies of variables, therefore we declare instance variables, if static it takes only one value
    public String color;
    public int year;
    public double price;

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }
    //print the object on the console
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void drive(){
        System.out.println("Driving " + brand + " " + model);
    }


}
