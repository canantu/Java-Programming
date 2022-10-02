package Java_Core_Classes.day12_Scanner;
import java.util.*;
public class ComputerSelection {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;

        System.out.println("Select screen size:");
        String screen = scan.nextLine();
        System.out.println("Select CPU type:");
        String cpu = scan.nextLine();
        System.out.println("Select RAM size:");
        int ram = scan.nextInt();
        scan.nextLine();
        System.out.println("Select storage type:");
        String storageType = scan.nextLine();
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();
        scan.nextLine();
        System.out.println("Select screen resolution:");
        String resolution = scan.nextLine();

        switch (screen) {
            case "13.3":
                totalPrice += 200;
                break;
            case "15.0":
                totalPrice += 300;
                break;
            case "17.3":
                totalPrice += 400;
                break;
        }

        switch (cpu) {

            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;

        }

        int ramRate = ram / 4;
        totalPrice += ramRate * 50;

        int storageRate = storageSize / 500;
        if (storageType.equals("HDD") ) {
            totalPrice += storageRate * 50;
        } else if (storageType.equals("SSD")) {
            totalPrice += storageRate * 100;
        }

        if (resolution.equals("FULLHD")) {
            totalPrice += 100;
        }else if (resolution.equals("4K")) {
            totalPrice += 200;
        }

        System.out.println("Final price is: " + totalPrice + "$");

        scan.close();


    }
}




