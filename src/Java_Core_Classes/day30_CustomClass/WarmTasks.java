package Java_Core_Classes.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmTasks {
    public static void main(String[] args) {
//write a program that swaps first and last element of a given ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers, 0,numbers.size()-1);
        System.out.println(numbers); //toString() method is called automatically, ArrayList has this method
        System.out.println("-------------------------------------");

        //write a method that moves all zeros to the end of the arraylist

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        int size = list.size();
        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int zeros = size - list.size();
        for (int i = 0; i < zeros; i++) {
            list.add(0);
        }

        System.out.println(list);
        System.out.println("----------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list2) {
            if (each != 0)
                result.add(each);
        }

        for (Integer each : list2) {
            if (each == 0)
                result.add(each);
        }

        System.out.println(result);
        System.out.println("----------------------------------------");

        //write a program that can extract special characters, digits and letters from a string
        String str = "ABCD123$%&'@456EFG!";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> special = new ArrayList<>(chars);
        special.removeIf(p-> Character.isLetterOrDigit(p));
        System.out.println(special);
        /*
        special.removeAll(letters);
        special.removeAll(digits);
         */










    }
}
