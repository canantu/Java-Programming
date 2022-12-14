package Java_Core_Classes.day27_WrapperClasses.PracticeTasks;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "Cydeo1990@";
        System.out.println(isStrongPassword(password));


    }

    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;  //has uppercase
        boolean r3 = false;  // has lowercase
        boolean r4 = false;  // has special char
        boolean r5 = false;  // has digit

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each))
                r2 = true;
            else if (Character.isLowerCase(each))
                r3 = true;
            else if (Character.isDigit(each))
                r5 = true;
            else r4 = true;   //else special character

            /*  to avoid unnecessary loops
            if (r1 && r2 && r3 && r4)
                break;
             */
        }

        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;

    }
}
