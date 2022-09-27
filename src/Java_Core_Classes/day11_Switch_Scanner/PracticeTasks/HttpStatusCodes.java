package Java_Core_Classes.day11_Switch_Scanner.PracticeTasks;

public class HttpStatusCodes {
    public static void main(String[] args) {


        int statusCode = 200;
        String result = "";

        if (statusCode == 200 || statusCode == 201 || statusCode == 202 || statusCode == 301){

            switch (statusCode){

                case 200:
                    result = "OK";
                    break;
                case 201:
                    result = "Created";
                    break;
                case 202:
                    result = "Accepted";
                    break;
                default:
                    result = "Moved Permanently";
            }
            System.out.println("Status Code: " + statusCode+ "\t" + result);




        }else System.out.println("Invalid Code");
    }
}
