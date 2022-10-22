package Replits;

public class PrintSquare {

    public static void main(String[] args) {

        for (int j = 0; j < 8; j++) {

            for (int i = 0; i < 8; i++) {

                if(j >= 1 && j < 7){

                    if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 )
                        System.out.print("  ");
                    else System.out.print("* ");
                }else System.out.print("* ");


            }
            System.out.println();

        }

    }
}
