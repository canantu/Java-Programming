package week08_10_29_2022;

public class Palindrome1 {

    public static void main(String[] args) {

        String[] arr = {"java","longer word","civic","apple","racecar","mom","anna", "abcdcba"};

        String result = "";

        int count = 0;

        for (String each : arr) {

            String temp = "";

            for (int i = each.length()-1; i >= 0 ; i--) {

                temp += each.charAt(i);

            }

            if(temp.equals(each) && temp.length() > result.length()) {
                result = temp;
                count++;
            }

        }

        if(count == 0)
            System.out.println("No Palindrome");
        else
            System.out.println(result);

    }
}
