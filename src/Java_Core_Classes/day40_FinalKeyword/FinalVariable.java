package Java_Core_Classes.day40_FinalKeyword;

public class FinalVariable {

    final char gender;
    final String birthDay;
    final static String batchNo;

    static {
        batchNo = "Batch-EU10";
    }
    public FinalVariable(char gender, String birthDay) {
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;
       // pi = 4.14; final variables are unchangeable
       // pi = 5.14;


        final String name;
        name = "Java";
        System.out.println(name);
        // name = "Wooden Spoon"; no more assignment is possible

        FinalVariable obj = new FinalVariable('F', "May/01");
        System.out.println(obj.birthDay);
        //obj.birthDay = "June/01"; can not be reassigned


        System.out.println(batchNo);
       // batchNo = "Batch-25";  final is unchangeable

    }
}
