package Java_Core_Classes.day11_Switch_Scanner;

public class CrewAndPassengers {
    public static void main(String[] args) {
        int number = 75;
        String result = "";

        boolean validNumber = number == 50 || number == 75 || number == 100;

        if (number ==50)
            result = "20 crew, 30 passengers";
        else if (number==75)
            result = "25 crew, 50 passengers";
        System.out.println(result);






    }
}
