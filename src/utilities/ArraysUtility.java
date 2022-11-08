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
            if (each == element) {
                result = true;
                break;
            }
        }

        return result;

    }
    //checks if the given char is contained in the given char array and returns boolean
    public static boolean contains(char[] array, char element){
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }

        return result;

    }

    //checks if the given double is contained in the given double array and returns boolean
    public static boolean contains(double[] array, double element){
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
                break;
            }
        }

        return result;

    }
    //checks if the given String is contained in the given String array and returns boolean
    public static boolean contains(String[] array, String element){
        boolean result = false;
        for (String each : array) {
            if (each.equalsIgnoreCase(element)) {
                result = true;
                break;
            }
        }

        return result;

    }

    // adds the given element into the array and returns a new array
    public static int[] addElement(int[] arr, int num){

        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length-1] = num;
        return newArray;
    }
    // adds the given element into the array and returns a new array
    public static double[] addElement(double[] arr, double num){

        double[] newArray = new double[arr.length + 1];

        int i= 0;
        for (double each : arr) newArray[i++] = each;
        newArray[i] = num;
        return newArray;
    }
    // adds the given element into the array and returns a new array
    public static String[] addElement(String[] arr, String str){

        String[] newArray = new String[arr.length + 1];

        int i= 0;
        for (String each : arr) newArray[i++] = each;
        newArray[i] = str;
        return newArray;
    }
    // adds the given element into the array and returns a new array
    public static char[] addElement(char[] arr, char ch){

        char[] newArray = new char[arr.length + 1];

        int i= 0;
        for (char each : arr) newArray[i++] = each;
        newArray[i] = ch;
        return newArray;
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(int[] array, int element){
        int freq = 0;
        for (int each : array) {
            if (each == element)
                freq++;
        }
        return freq;
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(double[] array, double element){
        int freq = 0;
        for (double each : array) {
            if (each == element)
                freq++;
        }
        return freq;
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(char[] array, char element){
        int freq = 0;
        for (char each : array) {
            if (each == element)
                freq++;
        }
        return freq;
    }

    //returns the frequency of a given element in an array
    public static int frequencyOfElement(String[] array, String element){
        int freq = 0;
        for (String each : array) {
            if (each.equals(element))
                freq++;
        }
        return freq;
    }

    //returns an array that includes all unique elements in an array
    public static int[] uniqueElement(int[] array){

        int[] result = {};
        for (int each : array) {
            if (frequencyOfElement(array, each) == 1)
                result = addElement(result, each);
        }
        return result;
    }

    //returns an array that includes all unique elements in an array
    public static double[] uniqueElement(double[] array){

        double[] result = {};
        for (double each : array) {
            if (frequencyOfElement(array, each) == 1)
                result = addElement(result, each);
        }
        return result;
    }

    //returns an array that includes all unique elements in an array
    public static char[] uniqueElement(char[] array){

        char[] result = {};
        for (char each : array) {
            if (frequencyOfElement(array, each) == 1)
                result = addElement(result, each);
        }
        return result;
    }

    //returns an array that includes all unique elements in an array
    public static String[] uniqueElement(String[] array){

        String[] result = {};
        for (String each : array) {
            if (frequencyOfElement(array, each) == 1)
                result = addElement(result, each);
        }
        return result;
    }

}
