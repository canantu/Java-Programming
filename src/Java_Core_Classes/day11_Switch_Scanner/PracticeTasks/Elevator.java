package Java_Core_Classes.day11_Switch_Scanner.PracticeTasks;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber  =2;
        String result = "";

        if (floorNumber == 1 || floorNumber == 2 ||floorNumber == 3 ){

            switch (floorNumber){

                case 1:
                    result = "Floor 1 is selected\nCompanies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result = "Floor 2 is selected\nCompanies: Cybertek, NASA, Intelsat";
                    break;
                default:
                    result = "Floor 3 is selected\nCompanies: Lyft, BofA, Steak House";

            }
            System.out.println(result);


        }else
            System.out.println("Invalid floor");



    }
}
