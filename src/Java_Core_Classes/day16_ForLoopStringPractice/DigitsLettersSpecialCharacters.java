package Java_Core_Classes.day16_ForLoopStringPractice;

public class DigitsLettersSpecialCharacters {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialChars  ="";
        char c;

        for (int i = 0; i < str.length(); i++) {
             c = str.charAt(i);
            if(c <= '9' && c >= '0')
                digits += c;
            else if (c <= 'z' && c >= 'a' || c <= 'Z' && c >= 'A')
                letters += c;
            else{
                if(c != ' ')  //ignore space
                    specialChars += c;

            }


        }

        System.out.println("specialChars = " + specialChars);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
    }
}
