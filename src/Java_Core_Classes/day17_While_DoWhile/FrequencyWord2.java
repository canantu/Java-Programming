package Java_Core_Classes.day17_While_DoWhile;

public class FrequencyWord2 {
    public static void main(String[] args) {

        String str = "Cat Dog Cat Dog cAt CAT CaT";

        int frequency = 0;
        for (int i = 0; i <= str.length()-3; i++) {
            String eachSub = str.substring(i, i+3);
            if(eachSub.equalsIgnoreCase("Cat"))
                frequency++;

        }
        System.out.println("frequency = " + frequency);
    }


}
