package Java_Core_Classes.day20_Arrays.PracticeTasks;

public class Grades {
    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 90)
                grades[i] = 'A';
            else if (scores[i] < 90 && scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] < 80 && scores[i] >= 70) {
                grades[i] = 'C';
            }

            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i]);
        }


    }
}
