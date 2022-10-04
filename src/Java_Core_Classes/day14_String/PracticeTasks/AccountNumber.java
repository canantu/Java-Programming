package Java_Core_Classes.day14_String.PracticeTasks;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an account number (String)");
        String accountNumber = scan.nextLine();

        if (accountNumber.charAt(0) == '2')
            if (accountNumber.length() != 7)
                System.out.println("invalid account number");
            else System.out.println(accountNumber);

        else if (accountNumber.charAt(0) == '5')
                if (accountNumber.length() != 10)
                    System.out.println("invalid account number");
                else System.out.println(accountNumber);

        else if (accountNumber.charAt(0) != '2' || accountNumber.charAt(0) == '5')
                    System.out.println("invalid account number");


        scan.close();

    }
}
