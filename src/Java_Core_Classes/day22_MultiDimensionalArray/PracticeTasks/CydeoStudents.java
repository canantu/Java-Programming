package Java_Core_Classes.day22_MultiDimensionalArray.PracticeTasks;

public class CydeoStudents {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilly", "Ayhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] batch25groups = new String[3][];
        batch25groups[0] = batch25Group1;
        batch25groups[1] = batch25Group2;
        batch25groups[2] = batch25Group3;

        String[] batch24Group1 = {"Fuat", "Kenan", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarak", "Erika", "Subhi", "Nadia", "Murodil"};


        String[][] batch24groups= new String[3][];
        batch24groups[0] = batch24Group1;
        batch24groups[1] = batch24Group2;
        batch24groups[2] = batch24Group3;

        String[][][] cydeoStudents = new String[2][][];
        cydeoStudents[0] = batch24groups;
        cydeoStudents[1] = batch25groups;

        for (String[][] batches : cydeoStudents) {
            for (String[] batch : batches) {
                for (String student : batch) {
                    System.out.println(student);
                }
            }
        }







    }
}
