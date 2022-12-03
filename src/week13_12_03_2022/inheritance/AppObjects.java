package week13_12_03_2022.inheritance;

public class AppObjects {
    public static void main(String[] args) {

        Instagram instagram = new Instagram(2.3);
        instagram.postPhoto();
        instagram.useApp(90);
        System.out.println(instagram);

        System.out.println("========================");
        Discord discord = new Discord(3.4);
        discord.chat();
        discord.useApp(100);
        System.out.println(discord);

    }
}
