package Java_Core_Classes.day35_Encapsulation;

public class CydeoStudentObject {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent(
                "Canan", 'F', 25, 10, 25, "SDET");

        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();

        student1.study();
        student1.study();

        System.out.println(student1);
    }
}
