package Java_Core_Classes.day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 30;
        String result = "";

        switch (number){  //{1,2,3,4,5,6,7}not a boolean, a data must be given
// performance is a lot faster than if
            // only compares equality

            case 1:   //values must be same type for all cases, they must be also unique
                result = "Monday";
                break;  //exits the switch after executing the case block
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;  //if break is not given, next case is executed regardless of its value
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:  //only get executed when none of the case blocks are matching
                result = "Invalid Number";
              //  break;  //if default is the last case, no need to write break


        }
        System.out.println(result);







    }



}
