package Java_Core_Classes.day24_CustomMethod_Return;
//in order to import class: import packagename.classname;
// to call method: classname.method()
public class MaxNumber {
    public static void main(String[] args) {
        int[] num = {1,3,5,2,9,6,4};
        int max = max(num);
        System.out.println("max = " + max);
    }

    public static int max(int[] num){
        int max = num[0];
        for (int i : num) {
            if (max < i)
                max = i;
        }

        return max;
    }
}
