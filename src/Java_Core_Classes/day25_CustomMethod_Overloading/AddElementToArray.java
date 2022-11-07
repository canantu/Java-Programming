package Java_Core_Classes.day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {

       int[] arr = {1,2,3,4};
       arr = addElement(arr, 5);
       System.out.println(Arrays.toString(arr));

       double[] arr1 = {1.2,3.4,5.6};
       arr1 = addElement(arr1,7.8);
       System.out.println(Arrays.toString(arr1));

       String[] arr2 = {"canan", "ali"};
       arr2 = addElement(arr2, "can");
       System.out.println(Arrays.toString(arr2));


        char[] arr3 = {'c', 'a', 'n', 'a'};
        arr3 = addElement(arr3, 'n');
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] addElement(int[] arr, int num){

        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length-1] = num;
        return newArray;
    }
    public static double[] addElement(double[] arr, double num){

        double[] newArray = new double[arr.length + 1];

        int i= 0;
        for (double each : arr) newArray[i++] = each;
        newArray[i] = num;
        return newArray;
    }
    public static String[] addElement(String[] arr, String str){

        String[] newArray = new String[arr.length + 1];

        int i= 0;
        for (String each : arr) newArray[i++] = each;
        newArray[i] = str;
        return newArray;
    }
    public static char[] addElement(char[] arr, char ch){

        char[] newArray = new char[arr.length + 1];

        int i= 0;
        for (char each : arr) newArray[i++] = each;
        newArray[i] = ch;
        return newArray;
    }

//the benefit is you don't need to memorize too many method names for the same functionality



}
