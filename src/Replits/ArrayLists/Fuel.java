package Replits.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Fuel {
    public static int refuels(ArrayList<Integer> deliveries,int gasTank) {

        int sum = 0;
        for (Integer delivery : deliveries) {
            sum += delivery;
        }

        int refuelNumber = sum / gasTank;
        if(sum % gasTank != 0)
            refuelNumber++;
        return refuelNumber;




    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

    }
}
