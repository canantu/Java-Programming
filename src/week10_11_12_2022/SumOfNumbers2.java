package week10_11_12_2022;

import java.util.Arrays;

public class SumOfNumbers2 {
    public static void main(String[] args) {
        String[] array = {"123", "341", "526"};
        System.out.println(Arrays.toString(sumNumbers(array)));
    }

    public static int[] sumNumbers(String[] array){
        int[] result = new int[array.length];
        int i = 0;
        for (String each : array) {
            result[i++] = sumDigits(Integer.parseInt(each));
        }
        return result;
    }

    private static int sumDigits(int num){
        int lastDigit = num % 10;
        int middleDigit = num / 10 % 10;
        int firstDigit = num / 100;

        return firstDigit + middleDigit + lastDigit;

    }
}
