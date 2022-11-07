package Replits.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static int[] merge(int[] a,int[] b) {
        int totalLength = a.length + b.length;
        int[] merged = new int[totalLength];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merged[i+a.length] = b[i];
        }
        return merged;

    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}
