package Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks;
//import Java_Core_Classes.day24_CustomMethod_Return.PracticeTasks.Reverse;
public class Palindrome {
    public static void main(String[] args) {
        String str = "Leveral";
        System.out.println(isPalindrome(str));
    }


    public static boolean isPalindrome(String str){
        boolean result = true;
        String reversed = Reverse.reverse(str);
        if (!str.equalsIgnoreCase(reversed))
            result = false;

        return result;


    }
}
