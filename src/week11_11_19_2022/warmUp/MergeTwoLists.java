package week11_11_19_2022.warmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        System.out.println(mergeLists(list1, list2));
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1,  ArrayList<Integer> list2){

        for (Integer each : list2) {
            list1.add(each);
        }

        return list1;
    }
}
