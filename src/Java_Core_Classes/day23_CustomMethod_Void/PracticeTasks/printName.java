package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class printName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.nextLine();
        System.out.println("Enter last name");
        String lastName = scan.nextLine();
        printFullName(firstName, lastName);
        scan.close();

    }

    public static void printFullName(String firstName, String lastName){

        System.out.println(firstName.substring(0,1).toUpperCase() +
                firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0,1).toUpperCase() +
                lastName.substring(1).toLowerCase());
    }
}
