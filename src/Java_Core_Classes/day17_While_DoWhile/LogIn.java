package Java_Core_Classes.day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        if(username.equals("cydeo") && password.equals("woodenspoon")){
            System.out.println("You are logged in!");
        }else {
            int attempt = 3;
            while(attempt>0 && !(username.equals("cydeo") && password.equals("woodenspoon"))){

                System.out.println("Username or password invalid! Please re-try!");
                if(attempt == 1){
                    System.err.println("This is your last chance.");
                }
                System.out.println("Enter your username: ");
                username = scan.next();
                System.out.println("Enter your password: ");
                password = scan.next();
                attempt--;

            }
            if(username.equals("cydeo") && password.equals("woodenspoon")){
                System.out.println("You are logged in!");
            }else System.out.println("your account is locked!");


        }





        scan.close();

    }
}
