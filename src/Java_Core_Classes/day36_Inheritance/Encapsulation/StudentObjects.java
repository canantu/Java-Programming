package Java_Core_Classes.day36_Inheritance.Encapsulation;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Canan", 3,'O', 'N', "MIT");

        student1.setGrade('A');
        System.out.println(student1);
        System.out.println("****************************************");

        Student.isStudent = false;
        System.out.println(student1);
    }
}
