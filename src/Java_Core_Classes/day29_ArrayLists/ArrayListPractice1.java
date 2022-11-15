package Java_Core_Classes.day29_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p -> p.length() >= 10);

        System.out.println(list);

        //converting ArrayList back to array
        countries = list.toArray(new String[0]); //any number can be given as size, it gets the size of list

        System.out.println(Arrays.toString(countries));


    }
}

/*
1. create an array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */
