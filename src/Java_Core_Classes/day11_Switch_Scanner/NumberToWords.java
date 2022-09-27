package Java_Core_Classes.day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int num =0;
        String result = (num >= 0 && num<=9)? (num == 0)? "zero" : (num == 1)? "one" : (num == 2)? "two" :
                (num == 3)? "three" :(num == 4)? "four" :(num == 5)? "five" :(num == 6)? "six" :(num == 7)? "seven" :
                        (num == 1)? "eight" :"nine":"Invalid Number";

        System.out.println(result);

        System.out.println("-----------------------");

        switch (num){
            case 0:
                result = "zero";
                break;
            case 1:
                result = "one";
                break;
            default:
                result = "Invalid Number";
        }
        System.out.println(result);








    }
}
