package week06_10_15_2022;

public class CountWord1 {
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        String word = "Java";
        int count = 0;

        for (int i = 0; i <= str.length()-word.length(); i++) {

            String each = str.substring(i, i+word.length());  //i+word.length()=34 is excluded
            if(each.equals(word))
                count++;

        }
        System.out.println(count);


    }
}
