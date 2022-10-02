package Java_Core_Classes.day12_Scanner;

import java.util.*;

public class Purchase {
    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW

        System.out.println("Hello, which item would you like?");
        Scanner scan = new Scanner(System.in);
        String item = scan.next();
        String result = "";
        int balance = 100;

        boolean isValidItem = Objects.equals(item, "Blanket") || Objects.equals(item, "Charger") || Objects.equals(item, "Hat") || Objects.equals(item, "Headphones")
                || Objects.equals(item, "Laptop") || Objects.equals(item, "Pants") || Objects.equals(item, "Pillow")
                || Objects.equals(item, "Smartphone") || Objects.equals(item, "Socks") || Objects.equals(item, "USB cable");

        if (isValidItem){

            switch(item){

                case "Blanket":
                    if(balance>=60){
                        result = "Thank you for your purchase!";
                        balance = balance - 60;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Charger":
                    if(balance>=5){
                        result = "Thank you for your purchase!";
                        balance = balance - 5;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Hat":
                    if(balance>=25){
                        result = "Thank you for your purchase!";
                        balance = balance - 25;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Headphones":
                    if(balance>=30){
                        result = "Thank you for your purchase!";
                        balance = balance - 30;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Laptop":
                    if(balance>=200){
                        result = "Thank you for your purchase!";
                        balance = balance - 200;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Pants":
                    if(balance>=50){
                        result = "Thank you for your purchase!";
                        balance = balance - 50;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Pillow":
                    if(balance>=40){
                        result = "Thank you for your purchase!";
                        balance = balance - 40;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Smartphone":
                    if(balance>=1000){
                        result = "Thank you for your purchase!";
                        balance = balance - 1000;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "Socks":
                    if(balance>=5){
                        result = "Thank you for your purchase!";
                        balance = balance - 5;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;
                case "USB cable":
                    if(balance>=10){
                        result = "Thank you for your purchase!";
                        balance = balance - 10;
                    }else result = "Sorry, not enough funds on your gift card";
                    break;


            }
            System.out.println(result);
            System.out.println("Your current balance is: "+ balance);


        }else
            result = "Sorry, that is an invalid item";




        scan.close();


    }
}

