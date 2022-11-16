package Java_Core_Classes.day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("Munich", "Alten", "SDET", 150000, true, true, true, true);
        offer2.setInfo("Stuttgart", "Porsche", "Test Engineer", 55000, true, false, false, true);
        offer3.setInfo("Frankfurt", "Mercedes", "BA", 60000, false, false, false, false);
        offer4.setInfo("Bruchsal", "SEW", "Scrum Master", 145000, true, false, false, false);
        offer5.setInfo("Karlsruhe", "Ferchau", "Senior QA Engineer", 70000, true, false, true, true);
        offer6.setInfo("Waldorf", "SAP", "SDET", 75000, true, false, true, true);
        offer7.setInfo("Berlin", "Audi", "QE", 185000, true, false, true, true);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.isWFH);

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p->p.jobTitle != "SDET");





    }
}
