package Java_Core_Classes.day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Enter a number: ");
            numbers[i] = scan.nextInt();

        }
        int sum  = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Average is " + sum / numbers.length);

        scan.close();
    }
}
