package week06_10_15_2022;

public class CountWord2 {

    public static void main(String[] args) {

        String str="Java is java in everywhere is Java";
        String word = "";

        /*for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) != ' ')
                word += str.charAt(i);
            else{
                System.out.println(word);
                word = "";
            }
        }*/

        while(str.length()>0){
            if(str.contains(" ")){
                word = str.substring(0, str.indexOf(" "));
                System.out.println(word);
                str = str.substring(word.length() + 1);
            }else {
                System.out.println(str);
                str = "";
            }
        }


    }
}
