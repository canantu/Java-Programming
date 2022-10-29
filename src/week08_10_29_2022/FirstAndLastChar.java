package week08_10_29_2022;

public class FirstAndLastChar {

    public static void main(String[] args) {

        String[] str = { "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        for (String s : str) {
            if (s.toLowerCase().charAt(0) == s.toLowerCase().charAt(s.length() -1))
                System.out.println(s);
        }
    }
}
