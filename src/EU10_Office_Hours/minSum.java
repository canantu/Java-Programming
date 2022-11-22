package EU10_Office_Hours;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.ceil;

public class minSum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n = scan.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("Enter the step number: ");
        int k = scan.nextInt();
        System.out.println(findMinSum(numbers, k));

    }

    public static int findMinSum(int[] arr, int k ){

        for (int i = 0; i < k; i++) {
            int max = arr[0];
            int index = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }

            double half = (max / 2);
            arr[index] = (int) Math.ceil(half);
            System.out.println(Arrays.toString(arr));
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;

    }
}
