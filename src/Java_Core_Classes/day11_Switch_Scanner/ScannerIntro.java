package Java_Core_Classes.day11_Switch_Scanner;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //constructor of Scanner //System class, in function
        // type Scanner , create a Scanner object
        System.out.println("Please enter an integer");
        int num1 = input.nextInt();
        System.out.println("You have entered: " + num1);
        System.out.println("=============================");
        System.out.println("Enter a decimal number");
        double num2 = input.nextDouble();
        System.out.println("You have entered: " + num2);
        System.out.println("Multiplication: " + num1 * num2);

        input.close();  //close the scanner, to avoid of extra load on memory
        //be sure that you do not use scanner after you close it



    }

}
