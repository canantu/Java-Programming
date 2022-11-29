package Java_Core_Classes.day36_Inheritance.Encapsulation;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Canan", 3,'O', 'N', "MIT");
        System.out.println(student1);

        student1.setGrade('A');
        student1.setGender('F');
        student1.setAge(29);
        System.out.println(student1);

        Student.isHuman = false; // not a good choice to define this variable as public, it should be unreachable
        System.out.println(student1);
    }
}
