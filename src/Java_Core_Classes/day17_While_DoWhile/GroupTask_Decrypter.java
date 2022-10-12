package Java_Core_Classes.day17_While_DoWhile;

public class GroupTask_Decrypter {

    public static void main(String[] args) {
        String str = "X GLROKBV LC X QELRPXKA JFIBP YBDFKP TFQE X PFKDIB PQBM";

        String check = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String decrypted = "";

        for (int i = 0; i < str.length(); i++) {

            String s = ""+str.charAt(i);
            if(s.equals("X") || s.equals("Y") || s.equals("Z")){

                int index = check.indexOf(s);
                decrypted += "" + check.charAt(index + 3 - 26);

            } else if (s.equals(" ")) {

                decrypted += " ";

            } else{
                int index = check.indexOf(s);
                decrypted += "" + check.charAt(index + 3);
            }

        }

        System.out.println(decrypted);



    }


}
