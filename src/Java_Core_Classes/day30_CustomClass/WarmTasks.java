package Java_Core_Classes.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmTasks {
    public static void main(String[] args) {
//write a program that swaps first and last element of a given ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers, 0,numbers.size()-1);
        System.out.println(numbers);




    }
}
