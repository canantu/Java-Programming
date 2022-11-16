package Java_Core_Classes.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Canan", 'F', 38, 123, 'A');
        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Ali", 'M', 44, 124, 'B');

        Student student3 = new Student();
        student3.setInfo("Cafidan", 'F', 29, 125, 'A');

        Student student4 = new Student();
        student4.setInfo("Alisan", 'F', 27, 126, 'C');

        Student student5 = new Student();
        student5.setInfo("Alim", 'M', 50, 127, 'D');

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(Arrays.asList(students));

        ArrayList<Student> angryBirds = new ArrayList<>(Arrays.asList(students));


        /*
        for (Student student : students) {
            if (student.grade == 'A')
                earlyBirds.add(student);
            else angryBirds.add(student);
        }
*/
        earlyBirds.removeIf(p-> p.grade != 'A');
        angryBirds.removeIf(p-> p.grade == 'A');

        System.out.println(earlyBirds);
        System.out.println(angryBirds);



    }
}
