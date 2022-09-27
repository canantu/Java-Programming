package Java_Core_Classes.day11_Switch_Scanner.PracticeTasks;

public class CappucinoBuyer {

    public static void main(String[] args) {

        String size = "grande";
        double price = 0;
        int calories = 0;

        if (size == "tall" || size == "grande" ||size == "venti" ){

            switch (size){

                case "tall":
                    price = 3.69;
                    calories = 90;
                    break;
                case "grande":
                    price = 3.99;
                    calories = 120;
                    break;
                default:
                    price = 4.29;
                    calories = 150;


            }
            System.out.println("price is $" + price + "\n"+calories+" calories");

        }else
            System.out.println("Invalid size");

    }
}
