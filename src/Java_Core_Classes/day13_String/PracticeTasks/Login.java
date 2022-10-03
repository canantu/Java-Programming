package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = scan.next();
        System.out.println("Enter your password: ");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Woodenspoon"))
            System.out.println("Logged in!");
        else System.out.println("Incorrect username or password!");


        scan.close();
    }
}
