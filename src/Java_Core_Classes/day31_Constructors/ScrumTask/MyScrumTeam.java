package Java_Core_Classes.day31_Constructors.ScrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

      // 4 tester objects
        Tester tester1 = new Tester("Canan", "QA", 110, 100000);
        Tester tester2 = new Tester("Ali", "QA", 120, 142000);
        Tester tester3 = new Tester("Alim", "QA", 130, 135000);
        Tester tester4 = new Tester("Can", "QA", 140, 115000);

        Tester[] testers = {tester2, tester3, tester4};
        // 4 developer objects

        Developer developer1 = new Developer("Eda", "Java Developer", 150, 125000);
        Developer developer2 = new Developer("Elif", "Java Master", 151, 185000);
        Developer developer3 = new Developer("Eysan", "Python Developer", 152, 135000);
        Developer developer4 = new Developer("Emine", "Senior Developer", 153, 155000);

        Developer[] developers = {developer2, developer3, developer4};
        // 1 scrum team object

        ScrumTeam scrum = new ScrumTeam("James", "Asiya", "Jenny", 14);

        System.out.println(scrum);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);
        System.out.println(scrum);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);
        System.out.println(scrum);

        System.out.println("-----------------------Testers------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name + ": " + eachTester.salary);
        }
        System.out.println("-----------------------Developers------------------------");
        for (Developer eachDeveloper : scrum.developersList) {
            System.out.println(eachDeveloper.name + ": " + eachDeveloper.salary);
        }
        System.out.println("----------------------------------------------------");
        scrum.removeTester(140);
        System.out.println(scrum);
        scrum.removeDeveloper(153);
        System.out.println(scrum);




    }
}
