package week15_12_17_2022.method_overriding.BankTask;

public class Bank {

    private int capital= 10000;
    public int getCapital(){
        return capital;
    }
    //how to get class name? getClass().getSimpleName()
    public void calculateInterest(){
        System.out.println("Interest of the " + getClass().getSimpleName());

    }


}
