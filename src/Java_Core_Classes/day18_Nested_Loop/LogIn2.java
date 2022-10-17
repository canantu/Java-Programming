package Java_Core_Classes.day18_Nested_Loop;

import java.util.Scanner;

public class LogIn2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.nextLine();
        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        if(username.equals("Cydeo")  && password.equals("WoodenSpoon")){
            System.out.println("Logged in!");


        }
        else{

            for (int i = 0; i < 3; i++) {

                System.out.println("Invalid username or password!");
                System.out.println("You have " + (3-i) + " trials left.");
                if(i == 2)
                    System.out.println("This is your last attempt!");
                System.out.println("Enter your username: ");
                username = scan.nextLine();
                System.out.println("Enter your password: ");
                password = scan.nextLine();

                if(username.equals("Cydeo")  && password.equals("WoodenSpoon")){
                    System.out.println("Logged in!");
                    break;
                }

            }
            if(!(username.equals("Cydeo")  && password.equals("WoodenSpoon")))
                System.out.println("Your account is locked! Please contact support team");

        }
        scan.close();




    }
}
