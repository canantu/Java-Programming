package Java_Core_Classes.day25_CustomMethod_Overloading;
import utilities.StringUtility;


public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";
        StringUtility.printEachChar(str);

        String result = StringUtility.reverse(str);
        System.out.println(result);

        String word = "Civic";
        System.out.println(StringUtility.isPalindrome(word));

        String word1 = "Java";
        System.out.println(StringUtility.isPalindrome(word1));

        String[] names = {"Anna", "Java", "Python", "Racecar", "Mom", "Cydeo"};
        int count = 0;
        for (String name : names) {
            if (StringUtility.isPalindrome(name))
                count++;
        }
        System.out.println(count);

        System.out.println(StringUtility.isAnagram("baba", "abba"));


        System.out.println(StringUtility.removeDuplicates("canan"));

    }

}
