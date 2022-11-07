package Replits.Arrays;

import java.util.Scanner;

public class NonDuplicate {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:
        String str = "";
        for(int i = 0; i<nums.length;  i++){
            int number = nums[i];
            int count = 0;
            for(int j=0; j<nums.length;j++){
                if(number == nums[j])
                    count++;
            }
            if(count == 1){
                str += number + ",";
            }

        }

        String array[] = str.split(",");
        if(array.length==1){
            System.out.println(array[0]);
        }else if (array.length > 1){
            System.out.println(array[0] + " (more than one unique number. but "+ array[0]+" is the first)");
        }






    }
}
