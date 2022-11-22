package Java_Core_Classes.day33_Statics.Practice_Tasks;

public class IPhone {
    public String model;
    public double price;

    public static String brand = "Apple";
    public static String OS = "IOS";
    public static boolean madeInChina =  true;


    public IPhone(String model, double price) {
        this.model = model;
        this.price = price;
    }


    public void faceTime(long phoneNumber){
        System.out.println(model + " is using FaceTime number " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(model + " is using FaceTime email " + email);
    }

    public void call(long phoneNumber){
        System.out.println(model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
