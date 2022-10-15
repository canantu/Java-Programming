package week06_10_15_2022;

public class CountWordWhile {

    public static void main(String[] args) {

        String sentence = "Java is java in everywhere is Java";

        String word = "Java";
        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word, ""); //replaceFirst is important, otherwise replaces all Java
        }
        System.out.println(count);
    }
}
