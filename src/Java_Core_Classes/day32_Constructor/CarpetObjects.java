package Java_Core_Classes.day32_Constructor;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2.5, 3.5, 10, true);
        Carpet carpet2 = new Carpet(2.5, 3.5, 10, false);
        System.out.println(carpet1);
        System.out.println(carpet2);


    }
}
// to create and object: new ExistingConstructor()