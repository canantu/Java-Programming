package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.

        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        int[] extinction = new int[inhabitants.length];  // zero array to check if extincted

        if(Arrays.equals(inhabitants, extinction))
            System.out.println("---- EXTINCT ----");
        else{
            int day = 1;
            while(!Arrays.equals(inhabitants, extinction)){

                int[] temp = new int[inhabitants.length]; //declare a temporary array to hold daily inhabitants values

                // copy inhabitants to temp
                System.arraycopy(inhabitants, 0, temp, 0, inhabitants.length);

                for(int i = 0; i < inhabitants.length; i++){    //walk through inhabitants

                    if(inhabitants[i] == 0){  //if there is any 0
                        if(i == 0){    //if it is the first index

                            if (temp[i+1] == inhabitants[i+1] ){  // if it didn't change in the same day before
                                temp[i + 1] = temp[i +1] / 2;   // lose half population
                            }

                        }else if(i == inhabitants.length -1){  //if last index

                            if (temp[i-1] == inhabitants[i-1] ) // if it didn't change in the same day before
                                temp[i-1] = temp[i-1] / 2;
                        }else{

                            if (temp[i-1] == inhabitants[i-1] ) // if it didn't change in the same day before
                                temp[i-1] = temp[i-1] / 2;  //element before
                            if (temp[i+1] == inhabitants[i+1] ) // if it didn't change in the same day before
                                temp[i + 1] = temp[i +1] / 2;  //element after
                        }
                    }

                }
                inhabitants = temp;
                System.out.println("Day " + (day) + " " + Arrays.toString(inhabitants));
                day++;

                if (Arrays.equals(inhabitants, extinction))
                    System.out.println("---- EXTINCT ----");
            }
        }
    }
}
