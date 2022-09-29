package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";

        System.out.println("How many people do you live with?");
        int people = input.nextInt();

        if (people<3)
            result = "Live with less than 3 people. ";
        else if (people>=3 && people<=6)
            result = "Live with 3-6 people.";
        else result = "Live more than 6 people.";

        System.out.println(result);
        input.close();
    }
}
