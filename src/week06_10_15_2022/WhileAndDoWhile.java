package week06_10_15_2022;

public class WhileAndDoWhile {
    public static void main(String[] args) {

        boolean flag = true;
        int i = 0;

        while(flag){

            System.out.print(i++ + " ");

            if(i >100){
                flag = false;
            }
        }
        System.out.println();
        i = 0;
        do{
            System.out.print(i++ + " ");

        }while (i<=100);







    }
}
