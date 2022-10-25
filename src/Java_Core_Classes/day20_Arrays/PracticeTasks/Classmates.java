package Java_Core_Classes.day20_Arrays.PracticeTasks;

public class Classmates {

    public static void main(String[] args) {

        String[] names = {"Canan Tunc", "Ali Tunc", "Vildan Tunc", "Beyza Tunc",
                "Canan Ali", "Ali Ali", "Vildan Ali", "Beyza Ali",
        "Canan Canan", "Ali Canan"};

        for (int i = 0; i < names.length; i++) {
            String fullName = names[i].toUpperCase();
            System.out.println(""+fullName.charAt(0) + fullName.charAt(fullName.indexOf(" ") + 1));
        }


    }
}
