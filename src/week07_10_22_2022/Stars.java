package week07_10_22_2022;

public class Stars {
    public static void main(String[] args) {

        int col = 4;
        int row = 7;
        for (int i = 0; i < (row*col) ; i++) {

            System.out.print("*");
            if ((i +1) % row == 0){
                System.out.println();
            }


        }
    }
}
