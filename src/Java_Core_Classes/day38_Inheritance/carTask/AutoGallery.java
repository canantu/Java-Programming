package Java_Core_Classes.day38_Inheritance.carTask;

public class AutoGallery {

    public static void main(String[] args) {
        Toyota toyota = new Toyota("Camry", "white", 2020, 356000, 12500);
        Tesla tesla = new Tesla("Model S", "black", 2020, 25000, 54000);

        System.out.println(toyota);
        System.out.println(tesla);

        toyota.start();
        tesla.start();

    }
}
