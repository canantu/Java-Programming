package Java_Core_Classes.day37_Inheritance.phoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String color, String size, double price) {
        super("Apple", model, color, size, price);
    }

    public final void faceTime(long phoneNumber){
        System.out.println(brand + "-" + model + " is having a Face Time with phone number: " + phoneNumber);
    }

    public final void faceTime(String email){
        System.out.println(brand + "-" + model + " is having a Face Time with email: " + email);
    }
}
