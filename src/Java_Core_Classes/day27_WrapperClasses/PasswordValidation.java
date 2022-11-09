package Java_Core_Classes.day27_WrapperClasses;

public class PasswordValidation {
    public static void main(String[] args) {

        String password = "CANAN";
        if (password.length()< 8 && !password.contains(" ")){
            System.out.println("Password should be minimum 8 characters long!");
        }
        int count1 = 0;
        for(char each : password.toCharArray()){
            if (Character.isUpperCase(each))
                count1++;
        }
        if (count1 == 0)
            System.out.println("Password should contain at least one uppercase character!");

        int count2 = 0;
        for(char each : password.toCharArray()){
            if (Character.isLowerCase(each))
                count2++;
        }
        if (count2 == 0)
            System.out.println("Password should contain at least one lowercase character!");

        int count3 = 0;
        for(char each : password.toCharArray()){
            if (Character.isDigit(each))
                count3++;
        }
        if (count3 == 0)
            System.out.println("Password should contain at least one digit!");

        int count4 = 0;
        for(char each : password.toCharArray()){
            if (!Character.isLetterOrDigit(each))
                count4++;
        }
        if (count4 == 0)
            System.out.println("Password should contain at least one special character!");


        if (count1 != 0 && count2 != 0 && count3 != 0 && count4 != 0)
            System.out.println("Password is successfully created!");





    }
}
