package week03_09_24_2022;

public class FindResult {
    public static void main(String[] args) {

        /*Task 6: Create a class which is "FindTheResult" create a variable
            int a=15;
         if a is divisable by 3 add 20
            if a is divisable by 5 add 25
            if a is divisable by 15 add 50 */

        int a = 15;
        System.out.println("a = " + a);
        if (a % 3 == 0)
            a += 20;
        System.out.println("a = " + a);
        if (a % 5 == 0)
            a += 25;
        System.out.println("a = " + a);
        if (a % 15 == 0)
            a += 50;
        System.out.println("a = " + a);    }
}
