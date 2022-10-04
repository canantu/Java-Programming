package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        if (email.contains("_")){
            String new_email = email.substring(email.indexOf("_")+1,email.indexOf("@"))+ "_" +
                    email.substring(0, email.indexOf("_"))+email.substring(email.indexOf("@"));
            System.out.println(new_email);

        }else System.out.println(email);




        scan.close();
    }
}
