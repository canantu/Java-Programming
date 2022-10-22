package week07_10_22_2022;

public class StringReplace2 {

    public static void main(String[] args) {

        String message = "I love cats! I have a cat named Coco. My cat's very smart!";
        while (true){
            if (message.contains("cat")){
                int a = message.indexOf("cat");
                message=message.substring(0,a)+"dog"+message.substring(a+3);

            }else{
                break;
            }

        }System.out.println(message);
    }
}
