package Java_Core_Classes.day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AABBCCAADD";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { //i : indexes of string
            char eachChar = str.charAt(i);
            if(eachChar == ch)
                frequency += 1;

        }

        System.out.println("frequency = " + frequency);
    }
}
