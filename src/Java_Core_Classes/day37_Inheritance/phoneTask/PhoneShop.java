package Java_Core_Classes.day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphon 12", "white", "6.7 inches", 1000);
        iphone.faceTime(123123456789L);
        iphone.faceTime("test@gmail.com");
        iphone.call(123123456789L);
        iphone.text(123123456789L);

        System.out.println(iphone);
        System.out.println("============================================");

        Samsung samsung = new Samsung("galaxy S19", "pink", "6 inches", 900);

        System.out.println("============================================");

        Nokia nokia = new Nokia("3310", "dark blue", "5.1", 100);
        nokia.selfDefense();
        System.out.println(nokia);

        System.out.println("============================================");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);



    }
}
