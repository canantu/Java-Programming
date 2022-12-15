package Java_Core_Classes.day38_Inheritance.Practice_Tasks;

public class ChromeBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
