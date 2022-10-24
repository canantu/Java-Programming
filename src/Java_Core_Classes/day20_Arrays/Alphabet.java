package Java_Core_Classes.day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26];
        alphabet[0] = 'Z';  //90
        alphabet[1] = 'Y';  //89
        alphabet[2] = 'X';  //88

/*        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            alphabet[i] = ch;
        }
*/
        for (char i = 0, j = 'Z'; i < alphabet.length; i++, j--)
            alphabet[i] = j;

        // System.out.println(alphabet);  //prints hashcode
        // System.out.println(alphabet[0]); //printing an element
        System.out.println(Arrays.toString(alphabet));

    }
}
