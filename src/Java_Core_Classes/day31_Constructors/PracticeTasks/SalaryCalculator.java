package Java_Core_Classes.day31_Constructors.PracticeTasks;

public class SalaryCalculator {
    //hourlyRate, stateTaxRate,federalTaxRate, weeklyHours

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;


    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                '}';
    }


    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return salary()*stateTaxRate;
    }

    public double federalTax(){
        return salary()*federalTaxRate;
    }

    public double salaryAfterTax(){
        return salary() - federalTax() - stateTax();
    }


}
/*
salary(): calculates the salary (
hourlyRate * weeklyHour * 52)
            stateTax(): calculates the
totalStateTax
            federalTax(): calculates the
total federal tax
            salaryAfterTax(): calculates the
salary after tax
            toString(): displays the salary,
stateTax, federalTax, salaryAfterTax of the Object
 */