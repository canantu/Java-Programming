package week10_11_12_2022;

import java.util.Arrays;

public class SumOfNumbers3 {
    public static void main(String[] args) {
        String[] array = {"123", "341", "526"};
        System.out.println(Arrays.toString(sumOfDigits(array)));
    }

    public static int[] sumOfDigits(String[] array){

        int[] result = new int[array.length];
        int i = 0;
        for (String each : array) {
            String[] numArray = each.split(""); //get each digit separately
            int sum = 0;
            for (String num : numArray) {
                sum += Integer.parseInt(num);
            }
            result[i++] = sum;
        }
        return result;
    }
}
