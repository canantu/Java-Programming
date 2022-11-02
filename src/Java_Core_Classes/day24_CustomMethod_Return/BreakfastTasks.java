package Java_Core_Classes.day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        showInitials("canan", "canan");
        displayDomain("canan.canan@gmail.com");

    }

    public static void showInitials(String firstName, String lastName){

        String initials = firstName.charAt(0) + "." + lastName.charAt(0);
        System.out.println(initials.toUpperCase());

    }
    public static void displayDomain(String email){
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf(".com"));
        System.out.println(domain);
    }



}
