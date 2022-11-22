package Java_Core_Classes.day33_Statics;

public class Iphone {

    public static String brand = "Apple";   // for all objects the value is same, declare and initialize one time
    public static String OS = "IOS";  //statics belong to the class, called through class name
    public String model;
    public double price;
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void printModelAndPrice(){
        System.out.println(model + " : " + price);
    }

    public void printModelAndOS(){
        System.out.println("model = " + model);
        System.out.println("OS = " + OS); //instance methods accept statics
    }

    public static void printBrandAndOS(){
        System.out.println("brand = " + brand); //static methods does not accept instances
        System.out.println("OS = " + OS);
    }

    // for instance methods we need objects, therefore as far as we don't use instance variable, it is better to use
    //static methods because objects use memory.


}
