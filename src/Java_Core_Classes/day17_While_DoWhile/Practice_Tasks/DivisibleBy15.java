package Java_Core_Classes.day17_While_DoWhile.Practice_Tasks;

import java.util.Scanner;

public class DivisibleBy15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = scan.nextInt();
        String div15 = "";
        String div3 = "";
        String div5 = "";

        for (int i = 1; i <= N; i++) {
            
            if(i % 15 == 0){
                
                div15 += i + " ";
                
            } else if (i % 3 == 0 && i % 15  != 0 && i % 5 != 0) {
                
                div3 += i + " ";
                
            } else if (i % 5 == 0 && i % 3 != 0 && i % 15 != 0) {
                
                div5 += i + " ";
                
            }
        }

        System.out.println("div15 = " + div15);
        System.out.println("div3 = " + div3);
        System.out.println("div5 = " + div5);


        scan.close();
    }
}
