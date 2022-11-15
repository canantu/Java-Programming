package Replits.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {
    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {

        int sum = 0;
        int nanuk = 0;
        for (String each : result) {
            if (each.equals("nanuk")){
                nanuk++;
                continue;
            }

            sum += Integer.parseInt(each);

        }

        boolean isSuccessful = sum >=boast && wayStones>=nanuk;
        return isSuccessful;








    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }
}
