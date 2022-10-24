package EU10_Office_Hours;

public class UniqueNumber {

    public static void main(String[] args) {

        int num = 1232342;
        String str = String.valueOf(num);
        int result = 0;
        String digit = "";

        for (int i = 0; i < str.length(); i++) {

            digit = ""+str.charAt(i);
            if (str.indexOf(digit) == str.lastIndexOf(digit))
                result += str.charAt(i) - 48;

        }
        System.out.println(result);
    }
}
