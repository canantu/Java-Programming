package utilities;

public class StringUtility {


    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }




}
