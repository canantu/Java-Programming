package Java_Core_Classes.day24_CustomMethod_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

    }

    public static void showMonth(int number){
        String month = "";

        if(number >=1 && number <= 12)
            month = (number == 1)? "Jan" : (number == 2)? "Feb" :(number == 3)? "March" :(number == 4)? "Apr" :
                    (number == 5)? "May" :(number == 6)? "June" :(number == 7)? "July" :(number == 8)? "Aug" :
                            (number == 9)? "Sep" :(number == 10)? "Oct" :(number == 11)? "Nov" :"Dec";

        else month = "Invalid";
        System.out.println("month = " + month);

    }
}
