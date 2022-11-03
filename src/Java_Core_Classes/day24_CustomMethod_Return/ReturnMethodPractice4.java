package Java_Core_Classes.day24_CustomMethod_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str = "caffhaoödnc  auwcc xkdanan";
        str = removeDuplicates(str);
        System.out.println(str);
    }

    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            if (!result.contains(""+ch))
                result += ch;
        }

        return result;

    }
}
