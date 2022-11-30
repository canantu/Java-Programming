package Java_Core_Classes.day37_Inheritance.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    ProductOwner PO;
    BusinessAnalyst BA;
    ScrumMaster SM;
    ArrayList<Tester> testerList = new ArrayList<>();
    ArrayList<Developer> developerList = new ArrayList<>();

    public void addTester(Tester tester){
        testerList.add(tester);
    }

    public void addTester(Tester[] testers){
        testerList.addAll(Arrays.asList(testers));
    }

    public void removeTester(int id){
        testerList.removeIf(p->p.id == id);
    }

    public void addDeveloper(Developer developer){
        developerList.add(developer);
    }

    public void addDeveloper(Developer[] developers){
        developerList.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int id){
        developerList.removeIf(p->p.id == id);
    }
    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", numberOfTesters=" + testerList.size() +
                ", numberOfDevelopers=" + developerList.size() +
                '}';
    }
}
