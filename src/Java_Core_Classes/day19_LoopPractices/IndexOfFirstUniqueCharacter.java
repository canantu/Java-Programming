package Java_Core_Classes.day19_LoopPractices;

public class IndexOfFirstUniqueCharacter {
    public static void main(String[] args) {


        String str = "aaccddeeef";
        String result = "";
        int index = 0;


        for (int i = 0; i < str.length(); i++) {

            char ch  =str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each  = str.charAt(j);
                if (ch == each)
                    count++;

            }
            if (count == 1){
                result += ch;
                index = i;
                break;
            }


        }

        System.out.println("First unique character is " + result + " and its index is " + index);


    }
}
