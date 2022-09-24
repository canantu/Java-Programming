package week02_09_17_2022;

import java.time.LocalDateTime;

public class CurrentTime {

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        int hour = today.getHour();
        int minute = today.getMinute();
        int second = today.getSecond();

        System.out.println(hour + ":" + minute + ":" + second);
        int year = today.getYear();
        int age = year - 1984;
        System.out.println("my age is: " + age);

    }
}
