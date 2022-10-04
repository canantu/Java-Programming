package Java_Core_Classes.day14_String;

public class StringMethod3 {
    public static void main(String[] args) {

        //substring(beginning index, ending index)

        String word= "Cydeo School";
        //            0123456789

        String brand = word.substring(0,5);  //ending index is excluded, so enter (ending index +1 )

        System.out.println("brand = " + brand);

        String word1 = word.substring(6);//substring is till the end, so no need to enter second arg

        System.out.println("word1 = " + word1);

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" "));
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        String s3 = word2.substring(word2.lastIndexOf(" ")+1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);





    }
}
