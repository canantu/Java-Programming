package week10_11_12_2022;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {

        String[] str = {"123", "34", "56"};
        System.out.println(Arrays.toString(sum(str)));

    }
    public static int[] sum(String[] array){
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(str.charAt(j)+"");
            }
            numbers[i] = sum;
        }
        return numbers;
    }
}
/*
Task 3 : String numbers to sum

                    Given an Array of numbers in String format, add each digit of each element and store into a different Array.

                    Ex:

                    Input:
                    “123”, “34”, “513”

                    Output:
                    [ 6, 7, 9 ]
 */