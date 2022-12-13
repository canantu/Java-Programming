package Java_Core_Classes.day38_Inheritance.carTask;

public class AutoGallery {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Corolla", "white", 2010, 356000, 2500);
        Tesla tesla = new Tesla("10", "black", 2020, 25000, 20000);

        System.out.println(toyota);
        System.out.println(tesla);
    }
}
