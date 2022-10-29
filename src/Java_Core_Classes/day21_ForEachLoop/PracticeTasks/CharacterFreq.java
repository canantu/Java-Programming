package Java_Core_Classes.day21_ForEachLoop.PracticeTasks;

public class CharacterFreq {

    public static void main(String[] args) {


        String str= "apple juice with a donut.";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch)
                    count++;
            }

            if (!result.contains(""+ch))
                result += ch + " = " + count + ", ";

        }

        System.out.println(result);


    }
}
