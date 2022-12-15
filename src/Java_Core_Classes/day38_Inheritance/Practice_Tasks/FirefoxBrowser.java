package Java_Core_Classes.day38_Inheritance.Practice_Tasks;

public class FirefoxBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }
}
