package week08_10_29_2022;

public class LongestPalindrome2 {
    public static void main(String[] args) {

        String[] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna", "abcdcba", "1234567"};
        int max = 0;
        for (String s : arr) {
            String palindrome = "";
            for (int i = s.length()-1; i >= 0; i--) {
                palindrome += s.charAt(i);
            }

            int size = 0;

            if (palindrome.equalsIgnoreCase(s)){
                size = palindrome.length();
            }
            if (size > max)
                max = size;



        }

        for (String s : arr) {
            String reversed = "";
            String palindrome = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                reversed += s.charAt(i);
            }
            if (reversed.equalsIgnoreCase(s)){
                palindrome = reversed;
            }
            if (palindrome.length() == max)

                System.out.println(palindrome);

        }




    }
}
