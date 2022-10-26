package Java_Core_Classes.day21_ForEachLoop;

public class Reversed {

    public static void main(String[] args) {

        String[] names = {"Canan Ali", "Ali Canan", "Canan Canan", "Ali Ali"};

        for (String name : names) {

            String reversed = "";
            for (int i = name.length() -1 ; i >=0 ; i--) {
                reversed += name.charAt(i);

            }

            System.out.println(reversed);
        }
    }
}
