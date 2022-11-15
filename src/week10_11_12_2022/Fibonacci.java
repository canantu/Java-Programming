package week10_11_12_2022;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    public static ArrayList<Integer> fibonacci(int n){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i == 0)
                list.add(0);
            else if (i == 1)
                list.add(1);
            else list.add(list.get(i-1) + list.get(i-2));
        }

        return list;
    }



}
