package Replits.Methods;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
        in.close();
    }


    public static int max(int x, int y){
        // WRITE YOUR METHOD BELOW
        int max = x;
        if(y > x)
            max = y;
        return max;

    }
}
