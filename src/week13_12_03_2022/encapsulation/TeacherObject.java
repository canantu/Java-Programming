package week13_12_03_2022.encapsulation;

public class TeacherObject {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("", 0);

        System.out.println(teacher);
        teacher.setName("canan");
        teacher.setAge(24);
    }
}
