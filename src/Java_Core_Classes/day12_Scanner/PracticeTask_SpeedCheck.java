package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class PracticeTask_SpeedCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int speedLimit = 80;
        String result = "";

        System.out.println("Enter current speed:");
        int speed = input.nextInt();

        if (speed > speedLimit)
            result = "You're driving " + (speed - speedLimit) +" mph over the limit. Slow down!!!!";

        System.out.println(result);
        input.close();
    }
}
