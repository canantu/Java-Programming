package Java_Core_Classes.day31_Constructors.PracticeTasks.Restaurant;

public class Server {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }


    public void takeOrder(){
        System.out.println(name + " is taking an order.");
    }

    public void cleanTable(){
        System.out.println(name + " is cleaning the table.");
    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + (fullTime? "full-time" : "part time") +
                '}';
    }
}
/*
name (String), employeeID (int),
hourlyRate (double), fullTime (boolean)
takeOrder(): server's name + "is taking an
order"
            cleanTable(): server's name + "is cleaning
the table"
 */