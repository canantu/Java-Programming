package Java_Core_Classes.day37_Inheritance.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

        ProductOwner po = new ProductOwner("Ali", 38, 'M', 112, 110000 );
        ScrumMaster sm = new ScrumMaster("Canan", 41, 'F', 113, 140000);
        BusinessAnalyst ba = new BusinessAnalyst("Veli", 29, 'M', 114, 110000);

        Tester tester1 = new Tester("Ayse", 28, 'F', 115, 120000, "Java");
        Tester tester2 = new Tester("Fatma", 32, 'F', 116, 125000, "C#");
        Tester tester3 = new Tester("Emre", 42, 'M', 117, 122000, "C++");
        Tester tester4 = new Tester("Emin", 34, 'M', 118, 126000, "Javascript");

        Tester[] testerArray = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Asim", 34, 'M', 119, 150000, "Java");
        Developer developer2 = new Developer("Zabit", 54, 'M', 120, 135000, "Python");
        Developer developer3 = new Developer("Derya", 27, 'F', 121, 145000, "JavaScript");
        Developer developer4 = new Developer("Han", 36, 'M', 122, 165000, "C++");

        ArrayList<Developer> developerList = new ArrayList<>(Arrays.asList(developer1, developer2, developer3,developer4));
        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addTester(tester1);
        scrumTeam.addTester(tester2);
        scrumTeam.removeTester(115);
        scrumTeam.removeTester(116);
        scrumTeam.addTester(testerArray);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDeveloper(developer2);


        System.out.println(scrumTeam);
        System.out.println(Arrays.toString(testerArray));



    }
}
