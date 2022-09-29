package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your building number");
        String building = scan.next();
        scan.nextLine();

        System.out.println("Enter your street name:");
        String street = scan.nextLine();

        System.out.println("Enter your City name: ");
        String city = scan.nextLine();

        System.out.println("Enter your state:");
        String state = scan.next();
        scan.nextLine();

        System.out.println("Enter your zipcode");
        int zipcode = scan.nextInt();

        System.out.println("name = " + name);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipcode = " + zipcode);

        scan.close();
    }
}
