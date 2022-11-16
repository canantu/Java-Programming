package Java_Core_Classes.day31_Constructors;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Canan", 38, 'F', 'A', 123);

        System.out.println(student1.name);

        Student student2 = new Student("Ali", 32, 'M', 'B', 234);
        System.out.println(student2);
    }
}
