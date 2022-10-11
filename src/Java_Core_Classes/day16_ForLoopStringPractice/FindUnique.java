package Java_Core_Classes.day16_ForLoopStringPractice;

public class FindUnique {
    public static void main(String[] args) {

        String str = "aabbsdfcee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        System.out.println("result = " + result);
    }
}
