package Java_Core_Classes.day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        String result = unique("acbdgazbaefsg");
        System.out.println(result);

        System.out.println("-------------------------------");
        String str = "acbdgazbaefsg";
        for (int i = 0; i < str.length() ; i++) {
            int freq = frequency(str, str.charAt(i));
            if (freq == 1)
                System.out.println(str.charAt(i));
        }
    }

    public static String unique(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (count == 1)
                result += str.charAt(i);

        }

        return result;
    }

    public static int frequency(String str, char ch){

        int count = 0;

        for (char each : str.toCharArray()){

            if (each == ch)
                count++;
        }

        return count;
    }
}
