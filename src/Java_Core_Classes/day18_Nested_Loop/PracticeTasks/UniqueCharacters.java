package Java_Core_Classes.day18_Nested_Loop.PracticeTasks;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            String c = ""+str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }

            }
            if (count == 1 && !(result.contains(c)) )
                result += c ;

        }
        System.out.println(result);
        scan.close();


    }
}
