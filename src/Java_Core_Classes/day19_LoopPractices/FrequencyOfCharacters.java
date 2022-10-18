package Java_Core_Classes.day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbccddd";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (c == each)
                    count ++;

            }
            if (result.contains(""+c)){
                continue;
            }else {
                result +=c;
                result += count;
            }


        }

        System.out.println(result);

    }
}
