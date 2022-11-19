package week11_11_19_2022.warmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class Divisible3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(divisibleBy3(list));
    }

    public static ArrayList<Integer> divisibleBy3(ArrayList<Integer> list){
        ArrayList<Integer> divList = new ArrayList<>();
        for (Integer each : list) {
            if (each % 3 == 0)
                divList.add(each);
        }

        //list.removeIf(p-> p % 3 != 0); we can also use removeIf method
        return divList;
    }


}
