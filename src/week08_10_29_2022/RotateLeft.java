package week08_10_29_2022;

import java.util.Arrays;

public class RotateLeft {

    public static void main(String[] args) {

        int[] x = {1,2,3,4,5,6};

        int temp = x[0];

        for (int i = 0; i < x.length-1; i++) {
            x[i] = x[i+1];
        }

        x[x.length-1] = temp;



        System.out.println(Arrays.toString(x));




    }
}
