package Java_Core_Classes.day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Arrays.toString(merge(arr1, arr2)));

        System.out.println("------------------------------------");
        double[] arr3 = {1.5,2.5,3.5};
        double[] arr4 = {4.5,5.5,6.5};
        System.out.println(Arrays.toString(merge(arr3, arr4)));

        System.out.println("------------------------------------");

        char[] arr5 = {'c', 'a', 'n'};
        char[] arr6 = {'a','n'};
        System.out.println(Arrays.toString(merge(arr5, arr6)));

        System.out.println("------------------------------------");

        String[] arr7 = {"can", "can"};
        String[] arr8 = {"ali"};
        System.out.println(Arrays.toString(merge(arr7, arr8)));
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int length = arr1.length + arr2.length;
        int[] arr = new int[length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, 0 + arr1.length, arr2.length);

        return arr;
    }

    public static double[] merge(double[] arr1, double[] arr2){
        int length = arr1.length + arr2.length;
        double[] arr = new double[length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, 0 + arr1.length, arr2.length);

        return arr;
    }

    public static String[] merge(String[] arr1, String[] arr2){
        int length = arr1.length + arr2.length;
        String[] arr = new String[length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, 0 + arr1.length, arr2.length);

        return arr;
    }
    public static char[] merge(char[] arr1, char[] arr2){
        int length = arr1.length + arr2.length;
        char[] arr = new char[length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, 0 + arr1.length, arr2.length);

        return arr;
    }
}
