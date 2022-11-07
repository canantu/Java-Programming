package Replits.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Populate {
    public static void main(String[] args) {
        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        populate(n);
    }
    //CREATE YOUR METHOD
    public static void populate(int num){
        int[] array = new int[num];
        for(int i= 0; i< num; i++)
            array[i] = i+1;

        System.out.println(Arrays.toString(array));
    }
}
