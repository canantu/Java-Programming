package week13_12_03_2022.inheritance;

public class MobileApp {
    public String name;
    public double version;

    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void useApp(int minutes){
        System.out.println(name + " is used today for " + minutes + " minutes.");
    }

    public void download(){
        System.out.println(name + " is downloaded");
    }

    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
/*
instance variables:
                name, version

instance methods:
    useTheApp(int minutes), download()
 */