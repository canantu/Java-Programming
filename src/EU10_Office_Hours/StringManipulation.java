package EU10_Office_Hours;

public class StringManipulation {

    public static void main(String[] args) {

        String s1 = "First product price is 1250 $";
        String s2 = "Second product price is 1500 $";

        String num1 = "";
        String num2 = "";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch <= 57 && ch >=48 )
                num1 += ch;
        }
        for (int j = 0; j < s2.length(); j++) {
            char ch = s2.charAt(j);
            if (ch <= 57 && ch >=48 )
                num2 += ch;
        }
        Integer number1 = Integer.valueOf(num1);
        Integer number2 = Integer.valueOf(num2);
        System.out.println(number1 + number2);
    }
}
