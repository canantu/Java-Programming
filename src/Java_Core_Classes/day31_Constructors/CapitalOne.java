package Java_Core_Classes.day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Canan", 123456);

        BankAccount account2 = new BankAccount();
        account2.setInfo("Ali", 234567);

        account1.checkBalance();
        account1.deposit(10000);
        account1.checkBalance();
        account1.withdraw(200);
        account1.checkBalance();
        account1.withdraw(10000);
        account1.checkBalance();


    }
}
