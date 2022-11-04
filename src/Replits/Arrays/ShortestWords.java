package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWords {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String[] arr = str.split(", ");
        int min = arr[0].length();
        String result = "";
        for(String each : arr){
            if(each.length() < min){
                min = each.length();
            }
        }

        for(String each : arr){
            if(each.length() == min)
                result += each + ",";
        }
        System.out.println(Arrays.toString(result.split(",")));

        scan.close();







    }
}
