package Replits.Methods;

import java.util.Scanner;

public class ProfitOrLoss {
    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW
        String result;
        if(buyPrice > sellPrice)
            result = "loss";
        else if(buyPrice < sellPrice)
            result = "profit";
        else
            result = "no loss";

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }
}
