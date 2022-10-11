package Java_Core_Classes.day16_ForLoopStringPractice;

public class ReverseWord {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        int len = str.length();
        // String result = "";

        for (int i = len-1; i >= 0; i--) {
            System.out.print(str.charAt(i)); //result += str.charAt(i);
        }
        //System.out.println(result);


    }
}
