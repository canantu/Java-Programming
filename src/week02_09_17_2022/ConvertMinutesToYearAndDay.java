package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {

    public static void main(String[] args) {

        int minutes = 3456789;
        int year = minutes / (365 * 24 * 60);
        int day = (minutes % (365 * 24 * 60)) / (24 * 60);

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days ");

    }
}
