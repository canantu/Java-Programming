package Java_Core_Classes.day25_CustomMethod_Overloading.PracticeTasks;

import java.util.Arrays;

public class MinElement {

    public static void main(String[] args) {
        int[] array = {1,5,3,9,6,3,8,0};
        System.out.println(min(array));
    }

    public static int min(int[] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min element of an array
    public static double min(double[] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min element of an array
    public static long min(long[] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min element of an array
    public static short min(short[] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min element of an array
    public static float min(float[] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min element of an array
    public static byte min(byte[] array){
        Arrays.sort(array);
        return array[0];
    }
}
