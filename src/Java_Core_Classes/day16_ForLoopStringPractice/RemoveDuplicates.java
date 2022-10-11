package Java_Core_Classes.day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbaaccddffgg";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String c = ""+str.charAt(i);  //contain method does not accept char character, therefore convert into string
            if(!result.contains(c)) {
                result += c;
            }
        }
        System.out.println("result = " + result);
    }
}
