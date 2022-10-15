package week06_10_15_2022;

import java.util.Scanner;

public class ReplaceCharAtIndex {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        System.out.println("Enter an index: ");
        int index = scan.nextInt();

        while(index >= str.length() || index < 0){
            System.out.println("Enter a valid index!");
            index = scan.nextInt();
        }


        for (int i = 0; i < str.length(); i++) {
            if(i == index)
                continue;
            else
                System.out.print(str.charAt(i)); //print each character one by one except

        }







    }
}
