package Replits.Methods;

import java.util.Scanner;

public class CountDuplicateElements {
    public static int getDup(String[] arr) {

        String result = "";
        int sum = 0;
        for (String each : arr) {
            if (!result.contains(each)){
                int count = 0;
                for (String s : arr) {
                    if (s.equals(each)){
                        count++;
                        result += s;
                    }

                }
                if (count > 1)
                    sum += count;
            }

        }
        return sum;





    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        String [] strs = new String[in.nextInt()];
        System.out.println("Enter array elements");
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
