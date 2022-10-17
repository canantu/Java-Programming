package Java_Core_Classes.day18_Nested_Loop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.nextLine();
        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        int attempt = 0;

        if(username.equals("Cydeo")  && password.equals("WoodenSpoon")){
            System.out.println("Logged in!");

        }else {
            while(!(username.equals("Cydeo") || password.equals("WoodenSpoon") ) && attempt <=2){
                System.out.println("Invalid username or password!");
                System.out.println("Enter your username: ");
                username = scan.nextLine();
                System.out.println("Enter your password: ");
                password = scan.nextLine();
                attempt++;

            }

            if(attempt>2){
                System.out.println("Your account is locked! Please contact support team");
            }else System.out.println("Logged in");





        }





    }
}
