package Java_Core_Classes.day33_Statics;

public class TestIphone {

    public static void main(String[] args) {
        System.out.println(Iphone.OS); // to call the statics, we don't need an object, through the class name

        Iphone.printBrandAndOS();  // call static methods through class name

        Iphone iphone1 = new Iphone("i11", 1000, "pink", "8.5");

        iphone1.printModelAndOS();  // call instance methods through objects
        iphone1.printModelAndPrice();

    }
}
