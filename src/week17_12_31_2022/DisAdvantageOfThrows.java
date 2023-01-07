package week17_12_31_2022;

public class DisAdvantageOfThrows {
    public static void main(String[] args) throws InterruptedException {

        waitFor(3);

    }

    // throws keyword temporary solution
    private static void waitFor(int seconds) throws InterruptedException {

        Thread.sleep(seconds*1000);
    }

    public static void methodA() throws InterruptedException {
        waitFor(2);
    }


    //try-catch block (cmd+alt+T)
    public static void sleepFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {

        }
    }
    public static void methodB(int seconds){
        sleepFor(seconds);
    }
}
