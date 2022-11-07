package Replits.Methods;

import java.util.Scanner;

public class SimpleBookingRoom {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // WRITE YOUR CODE BELOW:
        boolean result = true;
        if(isAvailable == false)
            result = false;
        else if(year != 2018)
            result = false;
        else if(year == 2018 && month == 7 && (day>=1 ||day <=8))
            result = false;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
