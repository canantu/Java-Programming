package Java_Core_Classes.day38_Inheritance.Practice_Tasks.Employee_Task;

public class ScrumTeam {
    public static void main(String[] args) {
        Tester tester  =new Tester("Canan", 28, 120, 130000, 'F' );
        Developer developer = new Developer("Ali", 34, 122, 140000, 'M');

        tester.work();
        developer.work();


    }
}
