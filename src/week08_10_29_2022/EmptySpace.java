package week08_10_29_2022;

public class EmptySpace {
    public static void main(String[] args) {

        String sentence = "Java  is    a    good      language.";

        String[] words = sentence.split("\\s+");
        for (String each: words) {
            System.out.println(each);
        }



    }
}
