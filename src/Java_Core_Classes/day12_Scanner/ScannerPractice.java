package Java_Core_Classes.day12_Scanner;
import java.util.Scanner;  //regular import: imports one class
//util.*  wild import: imports everything from the package, we import what we need, memory usage

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer between 1-7");

        int number = scan.nextInt();
        String result = "";  // if there is a guarantee that the variable has eventually a value,
        // then we don't have to initialize it.

        if (number >=1 && number <=7) {

            result = (number == 1)? "Monday" : (number == 2)? "Tuesday" : (number == 3)? "Wednesday"
                    : (number == 4)? "Thursday" : (number == 5)? "Friday" : (number == 6)? "Saturday" : "Sunday";
        }else result = "You have entered invalid number! Please try again!";

        System.out.println(result);
        scan.close(); // when we need anymore scan object, it is better to close it.
        /* otherwise it stays connected to the console. */



    }
}
