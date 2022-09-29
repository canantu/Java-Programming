package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class ScannerPractice5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int num = scan.nextInt();
        scan.nextLine();  // we need this statement to assign ENTER key

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter your GPA: ");
        int gdp = scan.nextInt();
        scan.nextLine();  // we need this statement to assign ENTER key

        System.out.println("Enter your school: ");
        String school = scan.nextLine();

        System.out.println("num = " + num);
        System.out.println("name = " + name);
        System.out.println("gdp = " + gdp);
        System.out.println("school = " + school);

        scan.close();

    }
}