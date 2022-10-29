package week08_10_29_2022;

public class FirstAndLastChar {

    public static void main(String[] args) {

        String[] str = { "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int count = 0;
        for (String s : str) {
            s = s.toLowerCase();
            if (s.charAt(0) == s.charAt(s.length() -1))
                count++;
        }

        System.out.println(count);

        System.out.println("=====================================");

        int counter = 0;
        for (String s : str) {
            String first = ""+s.charAt(0);
            String last = ""+s.charAt(s.length()-1);

            if (first.equalsIgnoreCase(last))
                counter++;
        }

        System.out.println(counter);
    }
}
