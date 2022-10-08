package week05_10_08_2022;

public class StringMethods {

    public static void main(String[] args) {
        String str = "Adam";

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));

        System.out.println(str.length());

        int len = str.length();
        int indexOfLastChar = len - 1;
        System.out.println(str.charAt(indexOfLastChar));

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        String str1 = " Canan Tunc ";
        System.out.println(str1);
        System.out.println(str1.trim());

        System.out.println(Character.toLowerCase(str1.charAt(1)));

        String number = "123456";
        System.out.println(number.indexOf('3'));


        String sentence = "Java is Java";
        System.out.println(sentence.lastIndexOf("J"));



    }
}
