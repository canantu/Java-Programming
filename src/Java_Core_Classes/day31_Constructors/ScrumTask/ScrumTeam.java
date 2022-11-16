package Java_Core_Classes.day31_Constructors.ScrumTask;

import Java_Core_Classes.day01_JavaIntro.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> developersList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM,int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }

    public void removeTester(int employeeID){
        testersList.removeIf(p-> p.employeeID == employeeID );
    }

    public void removeDeveloper(int employeeID){
        developersList.removeIf(p-> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", totalNumberOfTesters=" + testersList.size() +
                ", totalNumberOfDevelopers=" + developersList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
