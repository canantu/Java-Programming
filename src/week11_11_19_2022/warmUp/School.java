package week11_11_19_2022.warmUp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        Student student1 = new Student("Osman", 'M', 'A', LocalDate.of(2000, 1,1), 555);
        Student student2 = new Student("Erdem", 'M', 'B', LocalDate.of(1990, 1,1), 556);
        Student student3 = new Student("Ayse", 'F', 'C', LocalDate.of(1980, 1,1), 557);

        studentList.addAll(Arrays.asList(student1, student2, student3));
        System.out.println(showStudent(studentList));
    }

    // takes a student list as argument and returns list of students whose name starts with 'a'
    public static ArrayList<Student> showStudent(ArrayList<Student> studentList){

        ArrayList<Student> list = new ArrayList<>();
        for (Student student : studentList) {
            if (student.name.toLowerCase().startsWith("a"))
                list.add(student);
        }
        return list;
    }
}
