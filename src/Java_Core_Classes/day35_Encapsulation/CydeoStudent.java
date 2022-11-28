package Java_Core_Classes.day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public String fieldOfStudy;

    public static String schoolName;

    public static String language;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        language = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printSecretCode(){
        System.out.println(secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending the class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
