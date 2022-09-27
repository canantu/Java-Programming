package Java_Core_Classes.day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 2;
        int year = 2000;
        String result = "";

       if (number>=1 && number<=12){
           switch (number){
               case 4: case 6 : case 9: case 11:
                   result = "30";
                   break;
               case 2:
                   result = (year % 4 ==0)? "29":"28";  //ternaries
                   break;
               default:
                   result = "31";
           } System.out.println(result + " days");

       }else {
           System.out.println("Invalid number");
       }




    }
}
