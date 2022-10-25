package Java_Core_Classes.day20_Arrays.PracticeTasks;

public class ReversedNames {
    public static void main(String[] args) {

        String[] names = {"Canan Tunc", "Ali Tunc", "Cancan Tunc", "Alal Tunc",
                "Canan Ali", "Ali Ali", "Cancan Ali", "Alal Ali",
                "Canan Canan", "Ali Canan"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            String temp = "";
            for (int j = name.length() - 1 ; j >= 0 ; j--) {
                temp += name.charAt(j);
            }
            System.out.println(temp);
        }




    }
}
