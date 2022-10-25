package Java_Core_Classes.day20_Arrays;

import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {

        int numbers[] = {10, 5, 4, 28, 1, 0};
        int max = numbers[0];

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.out.println(max);


    }
}
