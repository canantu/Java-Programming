package week10_11_12_2022;
/*
Task 1 : Find the word
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        Write a method that returns : Welcome To Core Java
 */
public class FindSentence {
    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        System.out.println(findSentence(str));
    }

    public static String findSentence(String str){
        String result = "";
        for(char ch : str.toCharArray()){
            if (Character.isLetter(ch) || Character.isSpaceChar(ch))
                result += ch;
        }

        return result;
    }
}
