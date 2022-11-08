package Java_Core_Classes.day25_CustomMethod_Overloading.PracticeTasks;

import java.util.Arrays;

public class MaxNumber {

    public static void main(String[] args) {
        int[] array = {1,5,3,9,6,3,8,0};
        System.out.println(max(array));
    }

    //returns max element of an array
    public static int max(int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    //returns max element of an array
    public static double max(double[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    //returns max element of an array
    public static long max(long[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    //returns max element of an array
    public static short max(short[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    //returns max element of an array
    public static float max(float[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    //returns max element of an array
    public static byte max(byte[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }
}
