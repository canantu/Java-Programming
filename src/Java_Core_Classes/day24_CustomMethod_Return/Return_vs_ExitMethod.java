package Java_Core_Classes.day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
        nameOfMonth(50);
        nameOfMonth(2);
    }
    public static void nameOfMonth(int number){

        if (number < 1 || number > 12){
            System.out.println("Invalid");
            //return; //if the condition is met, don't run remaining codes
            System.exit(0);  //exits the whole system/program
        }

        String month = (number == 1)? "Jan" : (number == 2)? "Feb" : (number == 3)? "March" : (number == 4)? "Apr" :
                (number == 5)? "May" : (number == 6)? "June" : (number == 7)? "July" : (number == 8)? "Aug" :
                        (number == 9)? "Sep" : (number == 10)? "Oct" : (number == 11)? "Nov" : "Dec";

        System.out.println("month = " + month);

    }


}
