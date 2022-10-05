package Java_Core_Classes.day15_ForLoop;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int min = 2147483647;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            num = scan.nextInt();
            if(min > num)
                min = num;
        }

        System.out.println("min = " + min);
        scan.close();

    }

}
