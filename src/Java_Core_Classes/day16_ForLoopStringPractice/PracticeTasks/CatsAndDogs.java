package Java_Core_Classes.day16_ForLoopStringPractice.PracticeTasks;

public class CatsAndDogs {
    public static void main(String[] args) {

        String str = "cat dog cat cat dog cat canan tunc dog dog cat dog catdog";
        String str1 = str;
        int catCount = 0;
        int dogCount = 0;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < (i + str.length()/3); i++) {
            if(str.toLowerCase().contains("cat")){
                catCount += 1;
                c1 = str.toLowerCase().indexOf("cat");
                str = str.substring(c1+3);
            }
            else break;

        }
        for (int i = 0; i < (i + str1.length()/3); i++) {
            if(str1.toLowerCase().contains("dog")){
                dogCount += 1;
                c2 = str1.toLowerCase().indexOf("dog");
                str1 = str1.substring(c2+3);
            }
            else break;

        }

        boolean isCatEqualDog = (catCount == dogCount);

        System.out.println(isCatEqualDog);
    }
}
