package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] score = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i+1) + ":");
            score[i] = input.nextInt();
        }
        System.out.println("Enter the difficulty rating:");
        float difficulty = input.nextFloat();

        Arrays.sort(score);
        int sum = 0;
        for (int i = 1; i < 6 ; i++) {
            sum += score[i];
        }
        double finalScore = sum * difficulty * 0.6;
        System.out.print("Final Score: ");
        System.out.printf("%.2f", finalScore );

    }
}
