package week13_12_03_2022.warmup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    static ArrayList<Teacher> teachers = new ArrayList<>();
    //global variable, is defined outside a method or block, in order to reach it from every other methods in a class


    static {
        Teacher teacher1 = new Teacher("Muhtar", "Abc", 'M', LocalDate.of(1987, 12,12), 1234567890);
        Teacher teacher2 = new Teacher("Gürhan", "Abc", 'M', LocalDate.of(1977, 12,12), 1234567891);
        Teacher teacher3 = new Teacher("Aysun", "Abc", 'F', LocalDate.of(1967, 12,12), 1234567892);
        Teacher teacher4 = new Teacher("Mike", "Abc", 'M', LocalDate.of(1970, 12,12), 1234567893);
        Teacher teacher5 = new Teacher("Saim", "Abc", 'M', LocalDate.of(1989, 12,12), 1234567894);
        Teacher teacher6 = new Teacher("Asya", "Abc", 'F', LocalDate.of(1990, 12,12), 1234567895);

        teachers.addAll(Arrays.asList(teacher1, teacher2, teacher3, teacher4, teacher5, teacher6));

    }

    public static void main(String[] args) {

        ArrayList<Teacher> result = getTeachersNameStartWith("M");
        System.out.println(result);

    }

    private static ArrayList<Teacher> getTeachersNameStartWith(String prefix) {

        ArrayList<Teacher> list = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (teacher.name.startsWith(prefix))
                list.add(teacher);
        }

        return list;


    }

    public static void getFemaleTeachers(){

    }




}
