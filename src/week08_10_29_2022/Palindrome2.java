package week08_10_29_2022;

public class Palindrome2 {

    public static void main(String[] args) {

        String[] words = {"java","longer word","civic","apple","racecar","mom","anna", "abcdcba"};

        String longestPalindrome = "";
        for (String word : words) {

            boolean isPalindrome = true;


            // check until the half of the string, start by comparing first chars, if they don't match,
            // break the loop, faster method
            for (int i = 0; i < word.length()/2; i++) {
                char ch1 = word.charAt(i);
                char ch2 = word.charAt(word.length() - i -1);

                if (ch1 != ch2){
                    isPalindrome = false;
                    break;
                }

            }

            if (isPalindrome && word.length() > longestPalindrome.length())
                longestPalindrome = word;

        }

        System.out.println(longestPalindrome);
    }
}
