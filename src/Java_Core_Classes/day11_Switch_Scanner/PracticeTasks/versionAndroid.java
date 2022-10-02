package Java_Core_Classes.day11_Switch_Scanner.PracticeTasks;


import java.util.Scanner;

public class versionAndroid {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String version = input.nextLine();
        String result = "";
        System.out.println(version);
        //WRITE YOUR CODE BELOW:


        if ((version == "1.5") || (version == "1.6") || (version == "2.1") ||
                (version == "2.2") || (version == "2.3") || (version == "3.1") ||
                (version == "4.0") || (version == "4.1") || (version == "4.4") ||
                (version == "5.0") || (version == "8.0") || (version == "9.0")){

            switch(version){

                case "1.5":
                    result = "Cupcake";
                    break;
                case "1.6":
                    result = "Donut";
                    break;
                case "2.1":
                    result = "Eclair";
                    break;
                case "2.2":
                    result = "Froyo";
                    break;
                case "2.3":
                    result = "Gingerbread";
                    break;
                case "3.1":
                    result = "Honeycomb";
                    break;
                case "4.0":
                    result = "Ice Cream Sandwich";
                    break;
                case "4.1":
                    result = "Jelly Bean";
                    break;
                case "4.4":
                    result = "KitKat";
                    break;
                case "5.0":
                    result = "Lollipop";
                    break;
                case "8.0":
                    result = "Oreo";
                    break;
                case "9.0":
                    result = "Pie";
                    break;

            }


        }else
            result = "Not a valid version";

        System.out.println(result);
        input.close();









    }
}
