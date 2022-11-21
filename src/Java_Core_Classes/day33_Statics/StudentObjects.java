package Java_Core_Classes.day33_Statics;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Asli");
        Student student2 = new Student("Aslihan", 'F');
        Student student3 = new Student("Asim", 555);
        Student student4 = new Student("Bugra", 556, 'A');
        Student student5 = new Student("Basri", 'M', 34);
        Student student6 = new Student("Cevriye", 'F', 38, 557);
        Student student7 = new Student("Deniz", 'M', 26, 558, 'B');

        System.out.println(student1.equals(student2));

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};
        System.out.println(Arrays.toString(students));


    }
}
