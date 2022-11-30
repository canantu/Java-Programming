package Java_Core_Classes.day37_Inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia(String model, String color, String size, double price) {
        super("Nokia", model, color, size, price);
    }

    public void selfDefense(){
        System.out.println("You can use " + brand + "-" + model + " as a self defense tool :)");
    }


}
