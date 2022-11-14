package Java_Core_Classes.day28_ArrayLists.PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicated {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        ArrayList<Integer> duplicated = new ArrayList<>();

        for (Integer each : list) {
            if (duplicated.contains(each)){
                System.out.println(each);
                break;}
            duplicated.add(each);
        }

    }
}
