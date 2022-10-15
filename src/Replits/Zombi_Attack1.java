package Replits;

import java.util.Scanner;

public class Zombi_Attack1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        //WRITE YOUR CODE HERE:
        int day = 0;

        while(inhabitants>1){

            System.out.println("Day " + day + " [" + inhabitants + "]");
            inhabitants -= inhabitants/2;
            if(inhabitants == 1)
                System.out.println("---EXTINCT---");
            day++;

        }
    }
}
