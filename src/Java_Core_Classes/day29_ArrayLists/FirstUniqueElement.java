package Java_Core_Classes.day29_ArrayLists;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list);


        for (Integer each : list) {
            int freq = 0;
            for (Integer element : list) {
                if (element == each)
                    freq++;
            }

            if (freq == 1){
                System.out.println(each);
                break;
            }

        }





    }
}
/*
1. Write a program that can return the first unique elements from an arraylist
    * Do not use indexOf & lastIndexOf methods
 */