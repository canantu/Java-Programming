package week11_11_19_2022.warmUp;

import java.util.ArrayList;

public class UniqueOfTwo {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = {8,9,4,5,6,10};
        System.out.println(uniqueOfTwoArrays(arr1, arr2));

    }

    public static ArrayList<Integer> uniqueOfTwoArrays(int[] arr1, int[] arr2){

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr1) {
            if (!list.contains(each))
                list.add(each);
        }

        for (int each : arr2) {
            if (!list.contains(each))
                list.add(each);
        }

        return list;
    }
}
