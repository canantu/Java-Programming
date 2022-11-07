package Java_Core_Classes.day25_CustomMethod_Overloading;
import utilities.StringUtility;


public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        String result = StringUtility.reverse(str);
        System.out.println(result);

    }

}
