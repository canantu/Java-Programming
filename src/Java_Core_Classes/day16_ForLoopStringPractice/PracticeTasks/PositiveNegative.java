package Java_Core_Classes.day16_ForLoopStringPractice.PracticeTasks;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = new Scanner(System.in).nextInt();
            if(num < 0)
                negative += 1;
            else if(num > 0)
                positive += 1;
        }

        System.out.println(positive + " positive " + negative + " negative");


    }
}
