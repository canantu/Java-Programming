package Java_Core_Classes.day46_Polymorphism.PracticeTasks.BrowserTask;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver("Chrome");
        FirefoxDriver firefoxDriver = new FirefoxDriver("Firefox");
        EdgeDriver edgeDriver = new EdgeDriver("Edge");
        SafariDriver safariDriver = new SafariDriver("Safari");
        OperaDriver operaDriver = new OperaDriver("Opera");

        chromeDriver.executeScript("print(Hello World)");
        firefoxDriver.findElement("//button[@id='ie2']");
        edgeDriver.close();
        safariDriver.get("https://google.com");
        operaDriver.quit();
        chromeDriver.takeScreenShot();
        firefoxDriver.getTitle();
        System.out.println(edgeDriver.getBrowserName());

    }
}
