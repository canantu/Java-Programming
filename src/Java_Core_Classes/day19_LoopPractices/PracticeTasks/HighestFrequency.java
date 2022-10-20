package Java_Core_Classes.day19_LoopPractices.PracticeTasks;

public class HighestFrequency {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaabddddddbccddd";
        String result = "";
        int freq = 0;

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
            }else if(count>freq){
                result = ""+c;
                freq = count;
            }


        }

        System.out.println(result);
        System.out.println(freq);



    }
}
