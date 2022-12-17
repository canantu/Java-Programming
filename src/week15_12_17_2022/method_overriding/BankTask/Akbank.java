package week15_12_17_2022.method_overriding.BankTask;

public class Akbank extends Bank{
    @Override
    public void calculateInterest() {
        super.calculateInterest();
        System.out.println(getCapital()*7/100);
    }
}
