package week08_10_29_2022;

public class LongestPalindrome {

    public static void main(String[] args) {

        String[] words = {"java","longer word","civic","apple","racecar","mom","anna", "abcdcba"};
        //{"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        int maxSize = 0;

        for (String word : words) {
            boolean isPalindrome = true;
            String palindrome = "";

            for (int i = 0; i < word.length()/2; i++) {
                char ch1 = word.charAt(i);
                char ch2 = word.charAt(word.length() - i -1);

                if (ch1 != ch2){
                    isPalindrome = false;
                    break;
                }else palindrome = word;
            }

            if (palindrome.length() > maxSize)
                maxSize = palindrome.length();

        }

        for (String word : words) {
            boolean isPalindrome = true;
            String palindrome = "";

            for (int i = 0; i < word.length()/2; i++) {
                char ch1 = word.charAt(i);
                char ch2 = word.charAt(word.length() - i -1);

                if (ch1 != ch2){
                    isPalindrome = false;
                    break;
                }else palindrome = word;
            }

            if (palindrome.length() == maxSize)
                System.out.println(palindrome);;

        }





    }
}
