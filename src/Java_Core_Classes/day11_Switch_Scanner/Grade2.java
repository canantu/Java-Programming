package Java_Core_Classes.day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'F';
        String result = "";

        switch (ch){
            // case 'A':  case 'B': case 'C': case 'D':  it is also possible to write this way
            case 'A':   //OR logic applied in switch, there is no AND logic
            case 'B':
            case 'C':
            case 'D':
                result = "Passed";
                break;
            case 'F':
                result="Failed";
                break;
            default:
                result = "Invalid character";
        }
        System.out.println(result);









    }
}
