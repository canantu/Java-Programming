package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer element from an integer array in separate lines
    public static void printEachElement(int[] arr){
        for (int each : arr) System.out.println(each);
    }
    //prints each String element from a String array in separate lines
    public static void printEachElement(String[] arr){
        for (String each : arr) System.out.println(each);
    }
    //prints each double element from a double array in separate lines
    public static void printEachElement(double[] arr){
        for (double each : arr) System.out.println(each);
    }
    //prints each char element from a char array in separate lines
    public static void printEachElement(char[] arr){
        for (char each : arr) System.out.println(each);
    }

    //finds maximum number from an array and returns integer number
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //finds maximum number from an array and returns double number
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    //finds min number from an integer array and returns an int number
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    //finds min number from a double array and returns a double number
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }

    //checks if the given integer is contained in the given array and returns boolean
    public static boolean contains(int[] array, int element){
        boolean result = false;
        for (int each : array) {
            if (each == element)
                result = true;
        }

        return result;

    }
    //checks if the given char is contained in the given char array and returns boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for (char each : array) {
            if (each == element)
                result = true;
        }

        return result;

    }

    //checks if the given double is contained in the given double array and returns boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for (double each : array) {
            if (each == element)
                result = true;
        }

        return result;

    }


}
