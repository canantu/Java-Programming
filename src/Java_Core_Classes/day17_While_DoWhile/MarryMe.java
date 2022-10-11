package Java_Core_Classes.day17_While_DoWhile;

import java.util.Scanner;

public class MarryMe {
    public static void main(String[] args) {

        System.out.println("Will you marry me? yes/no");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();

        while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){

            System.out.println("Please enter a valid answer");
            answer = scan.next();
        }

        System.out.println(answer.equalsIgnoreCase("yes") ? "Congrats": "Goodbye");
        scan.close();

    }
}
