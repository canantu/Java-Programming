package Java_Core_Classes.day22_MultiDimensionalArray;

public class ReversSecondWord {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] words = sentence.split(" ");
        String word = words[1];
        String reversedWord = "";
        for (int i = word.length() -1 ; i >= 0 ; i--) {
            reversedWord += ""+word.charAt(i);
        }

        sentence = sentence.replaceFirst(word, reversedWord);
        System.out.println(sentence);

        System.out.println("========================================");
        //other solution
        words[1] = reversedWord;
        for (String each : words) {
            System.out.print(each + " ");
        }
        System.out.println();

    }
}
