package week15_12_17_2022.method_overriding.BankTask;

public class INGBank extends Bank{
    @Override
    public void calculateInterest() {
        super.calculateInterest();
        System.out.println(getCapital()*9/100);
    }
}
