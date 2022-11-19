package week11_11_19_2022.warmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        System.out.println(Arrays.toString(mergeLists(list1, list2)));
    }

    public static int[] mergeLists(ArrayList<Integer> list1,  ArrayList<Integer> list2){

        int[] result = new int[list1.size()+ list2.size()];

        int index = 0;
        for (Integer each : list1) {
            result[index++] = each;
        }
        for (Integer each : list2) {
            result[index++] = each;
        }

        return result;
    }
}
