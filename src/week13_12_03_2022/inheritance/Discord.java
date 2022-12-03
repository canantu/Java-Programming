package week13_12_03_2022.inheritance;

public class Discord extends MobileApp{

    public Discord(double version) {
        super("Discord", version);
    }

    public void chat(){
        System.out.println("User is chatting via " + name);
    }
}
