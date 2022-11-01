package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scan.nextInt();
        findPositiveOrNegative(number);
        scan.close();
    }

    public static void findPositiveOrNegative(int number){

        if (number < 0)
            System.out.println("negative");
        else if (number > 0)
            System.out.println("positive");
        else System.out.println("zero");
    }
}
