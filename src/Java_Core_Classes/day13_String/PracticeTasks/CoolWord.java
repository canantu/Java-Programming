package Java_Core_Classes.day13_String.PracticeTasks;

import java.util.Scanner;

public class CoolWord {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a three character word: ");
        String s = scan.nextLine();

        if (s.length()>3)
            System.out.println("Word is too long!");
        else if (s.length()<3)
            System.out.println("Word is too short!");

        else if (s.length() == 3){
            if (s.charAt(1) == 'a')
                System.out.println("Cool word!");
            else System.out.println("Okay word!");
        }

        scan.close();
    }
}
