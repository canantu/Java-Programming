package Java_Core_Classes.day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(100);
    }

    public static void nameOfDay(int num){ //in void method, we can also use return statement for exiting method

        if (num < 1 || num > 7) {
            System.out.println("Invalid!");
            return; //exits method immediately
        }
        String day = (num == 1)? "Mon": (num == 2)? "Tuesday":(num == 3)? "Wednesday":(num == 4)? "Thursday":
                (num == 5)? "Friday":(num == 6)? "Saturday":"Sunday";

        System.out.println("day = " + day);

    }


}
