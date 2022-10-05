package Java_Core_Classes.day15_ForLoop.Practice_Tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        int n = new Scanner(System.in).nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum +=i;
        }
        System.out.println("sum = " + sum);

        System.out.println("----------------------------------------");





    }
}
