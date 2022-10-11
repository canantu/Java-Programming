package Java_Core_Classes.day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AABBCAADDEGGEEDWWSSWFEEWRC";
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);

            if(result.contains(ch))
                continue;  //if the character already in results, we skip it with continue
            result += ch;


        }

        System.out.println(result);
    }
}
