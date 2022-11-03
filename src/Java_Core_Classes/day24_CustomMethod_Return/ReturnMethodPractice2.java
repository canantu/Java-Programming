package Java_Core_Classes.day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String grade = grade(38);

        String result = (grade.equals("A"))? "Excellent" : (grade.equals("B"))? "Great" : (grade.equals("C"))? "Good" :
                (grade.equals("D"))? "Passed" : "Failed";

        System.out.println(result);
    }

    //create a function that can calculate the grade
    /*
    check the grade:
        'A' --- excellent
        'B' --- great
        'C' ---- good
     */

    public static String grade(int score){
        String result = "";
        if (score < 0 || score > 100)
        {
            result = "Invalid!";
        }else if (score >= 90)
            result = "A";
        else if (score >= 80)
            result = "B";
        else if (score >= 70)
            result = "C";
        else if (score >= 60)
            result = "D";
        else result = "F";

        return result;


    }
}
