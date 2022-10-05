package Java_Core_Classes.day15_ForLoop;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int max = -2147483648;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            num = scan.nextInt();
            if(max < num)
                max = num;
        }

        System.out.println("max = " + max);

    }
}
