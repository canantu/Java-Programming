package Java_Core_Classes.day16_ForLoopStringPractice.PracticeTasks;

public class FrequencyJava {

    public static void main(String[] args) {

        String str = "Java Java Java JAVA java canan java java tunc Java java google java ";
        int count = 0;
        int c = 0;

        for (int i = 0; i < (i + str.length()/4); i++) {
            if(str.toLowerCase().contains("java")){
                count += 1;
                c = str.toLowerCase().indexOf("java");
                str = str.substring(c+4);
            }
            else break;

        }
        System.out.println("count = " + count);



    }
}
