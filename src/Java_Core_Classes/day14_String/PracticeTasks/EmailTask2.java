package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email address: ");

        String email = scan.nextLine();
        String firstName = email.substring(0, email.indexOf("_"));
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        String domain = email.substring(email.indexOf("@")+1, email.indexOf(".com"));



        System.out.println("First name: " + firstName + "\nLast Name: " + lastName +
                "\nDomain: " + domain);



        scan.close();
    }
}
