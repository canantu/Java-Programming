package Replits;
import java.util.Scanner;
public class ShoppingList {

    public static void main(String[] args) {

        Scanner scan  =new Scanner(System.in);
        int count = 0;
        String shoppingList = "";
        String quantityList = "";
        String costList = "";
        double totalCost = 0;

        while(true){
            count++;
            System.out.println("Enter the name of item " + count );
            String itemName = scan.next();
            shoppingList += ""+itemName + " x ";
            System.out.println("Enter the price of the " + itemName );
            double itemPrice = scan.nextDouble();
            System.out.println("How many " + itemName + " will you buy?");
            int quantityItem  = scan.nextInt();
            shoppingList += quantityItem + " - " + (itemPrice * quantityItem) + "\n" ;

            totalCost +=  itemPrice * quantityItem;

            System.out.println("Do you want to add more items to the shopping list?");
            String answer = scan.next();
            if(answer.equals("no")){
                System.out.println("SHOPPING LIST:");
                System.out.print(shoppingList);
                System.out.println("Total cost: " + totalCost);
                break;

            }

        }
    }
}
