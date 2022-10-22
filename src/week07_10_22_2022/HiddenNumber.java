package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class HiddenNumber {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int hiddenNumber = random.nextInt(10) + 1;

        int guess = 0;
        boolean flag = true;

        do {
            System.out.println("make a guess");
            guess = scan.nextInt();

            if (guess < hiddenNumber){
                System.out.println("it is smaller than the number");
            } else if (guess > hiddenNumber) {
                System.out.println("it is bigger than the number");
            } else if (guess == hiddenNumber) {
                System.out.println("you found it");
                flag = false;
            }

        } while (flag);






    }
}
