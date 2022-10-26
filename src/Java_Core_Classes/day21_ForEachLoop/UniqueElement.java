package Java_Core_Classes.day21_ForEachLoop;

public class UniqueElement {
    public static void main(String[] args) {


        String[] words = {"Layan", "Oleksandr", "Olga", "Layan", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};



        for (String word : words) {
            int count = 0;
            for (String element : words) {
                if (word.equals(element))
                    count++;
            }

            if (count == 1)
                System.out.println(word);
        }



    }
}
