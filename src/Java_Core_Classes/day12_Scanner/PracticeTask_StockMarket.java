package Java_Core_Classes.day12_Scanner;

import java.util.Scanner;

public class PracticeTask_StockMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int share = 0;
        String result = "";
        double stockValue = 0;
        String company = "";

        System.out.println("How many total shares do you have already?");
        share = scan.nextInt();

        if (share > 0){
            System.out.println("How much is their total value in the stock market?");
            stockValue = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter the name of the company do you have the most shares in?");
            company = scan.nextLine();

            result = "Your total stock market holding is $" + stockValue + " which is made up of " + share + " shares. "
                + company + " is your company holdings";

        }else result = "Invalid share!!!";

        System.out.println(result);

        scan.close();





    }
}
