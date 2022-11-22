package Java_Core_Classes.day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String name;
    public static String schoolName;

    public CydeoStudent(String name) {
        this.name = name;
        // schoolName = "Cydeo School";
        // we do not need to set static variable inside constructor
        // it is not an efficient way, it consumes memory
    }

    static {
        schoolName = "Cydeo School";
    }
}

class CydeoStudentObject{
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Canan");
        CydeoStudent student2 = new CydeoStudent("Ali");

        System.out.println(student1.schoolName);
        // System.out.println(student2.schoolName);

    }
}
