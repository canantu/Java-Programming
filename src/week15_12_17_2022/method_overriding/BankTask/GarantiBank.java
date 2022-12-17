package week15_12_17_2022.method_overriding.BankTask;

public class GarantiBank extends Bank{
    @Override
    public void calculateInterest() {
        super.calculateInterest();
        System.out.println(getCapital()*8/100);
    }
}
