package Java_Core_Classes.day19_LoopPractices;

public class CharactersAppearedTwice {
    public static void main(String[] args) {

        String str = "aabccddeee";
        String result = "";


        for (int i = 0; i < str.length(); i++) {

            char ch  =str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each  = str.charAt(j);
                if (ch == each)
                    count++;

            }
            if ((count == 2) && !result.contains(""+ch)){
                result += ch;
            }


        }

        System.out.println(result);
    }
}
