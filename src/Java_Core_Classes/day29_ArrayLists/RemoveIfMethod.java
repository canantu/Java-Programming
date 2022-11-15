package Java_Core_Classes.day29_ArrayLists;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

 /*       for (Integer each : list) {
            if (each % 2 != 0)
                list.remove(each); //does not work because list size changes everytime, ConcurrentModificationException
        }*/

        list.removeIf(p -> p<5);  //remove all the elements less than 5 //lambda expression
        System.out.println(list);

        System.out.println("--------------------------------------");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list2.removeIf(p-> p % 2 == 0); //lambda expression
        System.out.println(list2);


        System.out.println("--------------------------------------");

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Java", "Python", "Javascript", "C#", "C++", "Java", "Java"));
        list3.removeIf(p -> p.startsWith("J"));
        System.out.println(list3);

        System.out.println("--------------------------------------");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python"));

        names.removeIf(name -> !StringUtility.isPalindrome(name));
        System.out.println(names);




    }
}
