package utilities;

public class ArraysUtility {

    //prints each integer element from an integer array in separate lines
    public static void printEach(int[] arr){
        for (int each : arr) System.out.println(each);
    }
    //prints each String element from a String array in separate lines
    public static void printEach(String[] arr){
        for (String each : arr) System.out.println(each);
    }
    //prints each double element from a double array in separate lines
    public static void printEach(double[] arr){
        for (double each : arr) System.out.println(each);
    }
    //prints each char element from a char array in separate lines
    public static void printEach(char[] arr){
        for (char each : arr) System.out.println(each);
    }
}
