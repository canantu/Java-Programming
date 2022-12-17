package week15_12_17_2022.method_overriding.BankTask;

public class TestsInterest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.calculateInterest();

        System.out.println("*********************");
        INGBank ingBank = new INGBank();
        ingBank.calculateInterest();
        System.out.println("*********************");
        Akbank akbank = new Akbank();
        akbank.calculateInterest();

        GarantiBank garantiBank = new GarantiBank();
        garantiBank.calculateInterest();
    }
}
