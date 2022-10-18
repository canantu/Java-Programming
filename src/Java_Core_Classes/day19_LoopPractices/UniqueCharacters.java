package Java_Core_Classes.day19_LoopPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

        // if indexOf and lastIndexOf is equal, it is unique

        String str = "aabccccdeee";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (ch == each)
                    count++;

            }
            /*if (count == 1)
                result += ch;*/

            if (count != 1)
                continue;
            else
                result += ch;

        }

        System.out.println(result);













    }
}
