package Java_Core_Classes.day28_ArrayLists;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();  //first data type is mandatory, second is optional
        ArrayList<String> names = new ArrayList<>();

        System.out.println(numbers); // no need to call toString method to print it
        System.out.println(names);
    }
}
