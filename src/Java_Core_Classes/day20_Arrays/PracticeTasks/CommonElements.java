package Java_Core_Classes.day20_Arrays.PracticeTasks;

public class CommonElements {

    public static void main(String[] args) {

        int numbers1[] = {1,2,3,4,5};
        int numbers2[] = {2,4,6,8,10};

        int element = 0;

        for (int i = 0; i < numbers1.length; i++) {
            element = numbers1[i];
            for (int j = 0; j < numbers2.length; j++) {
                if (element == numbers2[j])
                    System.out.print(element + " ");
            }
        }
    }
}
