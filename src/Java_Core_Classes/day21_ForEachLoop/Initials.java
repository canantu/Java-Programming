package Java_Core_Classes.day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Canan Ali", "Ali Canan", "Canan Canan", "Ali Ali"};

        for (String name : names) {

            System.out.println(name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1) + ".");
        }
    }
}
