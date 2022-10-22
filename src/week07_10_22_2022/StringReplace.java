package week07_10_22_2022;

public class StringReplace {

    public static void main(String[] args) {

        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        String newMessage = "";
        while (message.contains("cat")){

            newMessage += message.substring(0, message.indexOf("cat"));
            message = message.substring(message.indexOf("cat") + 3);
            newMessage += "dog";
        }
        newMessage += message;

        System.out.println(newMessage);



    }
}
