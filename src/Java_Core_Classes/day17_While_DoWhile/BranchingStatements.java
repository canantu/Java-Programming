package Java_Core_Classes.day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (char i = 'A'; i <='Z'; i++) {
            if(i == 'F')
                break;
            System.out.print(i + " ");
        }
        System.out.println("----------------------------");

        while(true){  ///infinite loop
            System.out.println("enter a number");
            int num= scan.nextInt();
            if(num<0)
                break;  //exit the infinite loop
        }
        System.out.println("-----------------------------");







    }
}
