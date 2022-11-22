package Java_Core_Classes.day33_Statics.Practice_Tasks;

public class IPhoneObjects {
    public static void main(String[] args) {
        IPhone iphone1 = new IPhone("i10", 1500);

        iphone1.toString();
        iphone1.call(1234567890);
        iphone1.text(1234567890);
        iphone1.faceTime("canan@gmail.com");
        iphone1.faceTime(1234567890);
    }
}
