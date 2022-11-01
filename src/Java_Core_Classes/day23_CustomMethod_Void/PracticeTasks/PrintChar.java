package Java_Core_Classes.day23_CustomMethod_Void.PracticeTasks;

import java.util.Scanner;

public class PrintChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        printEachChar(str);
        scan.close();
    }

    public static void printEachChar(String str){

        char[] array = str.toCharArray();
        for (char c : array) {
            System.out.print(c + ", ");
        }
    }
}
