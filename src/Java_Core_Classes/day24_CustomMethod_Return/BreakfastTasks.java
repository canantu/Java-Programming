package Java_Core_Classes.day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        showInitials("canan", "canan");
        displayDomain("canan.canan@gmail.com");
        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "elminur@cydeo.com", "gulsen@gmail.com"};

        for (String email : emails) {
            displayDomain(email);
        }
        showMonth(10);
        showDay(5);
    }

    public static void showInitials(String firstName, String lastName){

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println(initials.toUpperCase());

    }
    public static void displayDomain(String email){
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);
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
    public static void showDay(int number){
        String day = "";

        if(number >=1 && number <= 12)
            day = (number == 1)? "Monday" : (number == 2)? "Tuesday" :(number == 3)? "Wednesday" :
                    (number == 4)? "Thursday" : (number == 5)? "Friday" :
                            (number == 6)? "Saturday" : "Sunday" ;
        else day = "Invalid";
        System.out.println("month = " + day);

    }






}
