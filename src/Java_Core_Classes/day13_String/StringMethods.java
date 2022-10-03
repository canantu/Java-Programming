package Java_Core_Classes.day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
        */

        System.out.println("---------------------");
        String s1= "Batch 10 is the best batch!";

        int len = s1.length();
        System.out.println("len = " + len);

        char lastChar = s1.charAt(len - 1); //last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("Batch 10 is the best batch!".length());

        System.out.println("------------------------");

        s1 = s1.toUpperCase();
        System.out.println(s1);

        s1 = s1.toLowerCase();
        System.out.println(s1);
        

        
    }
}
