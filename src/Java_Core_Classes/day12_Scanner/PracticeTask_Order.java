package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class PracticeTask_Order {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String productName = "";
        double price = 0;
        int quantity = 0;
        String name = "";

        System.out.println("Enter the product name:");
        productName = scan.nextLine();

        System.out.println("Enter the price:");
        price = scan.nextDouble();

        System.out.println("Enter the quantity:");
        quantity = scan.nextInt();

        System.out.println("Enter your first name:");
        name = scan.next();

        System.out.println(name + ", your order for " + quantity + " " + productName + " has been placed.\n" +
                "Your total is " + (price * quantity) + ".");

        scan.close();

    }
}
