package Java_Core_Classes.day37_Inheritance.phoneTask;

public class Samsung extends Phone{
    public Samsung(String model, String color, String size, double price) {
        super("Samsung", model, color, size, price);
    }

    public void freeze(){
        System.out.println(brand + "-" + model + " is freezing");
    }
}
