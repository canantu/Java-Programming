package Replits;

import java.util.Scanner;

public class Zombi_Attack1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        scan.close();
        //WRITE YOUR CODE HERE:
        int day = 0;
        double wipeOut = 0;

        while(inhabitants>1){
            System.out.println("Day " + day + " [" + inhabitants + "]");
            wipeOut = inhabitants / 2;
            inhabitants -= (int) wipeOut;
            day++;
        }
        if(inhabitants == 1){
            System.out.println("Day " + day + " [" + inhabitants + "]");
            System.out.println("---- EXTINCT ----");
        }


    }
}
