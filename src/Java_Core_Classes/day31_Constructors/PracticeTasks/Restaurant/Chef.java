package Java_Core_Classes.day31_Constructors.PracticeTasks.Restaurant;

public class Chef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + (fullTime? "full-time" : "part time") +
                '}';
    }

    public void makeOrder(){
        System.out.println(name + " is making an order.");
    }

    public void washDishes(){
        System.out.println(name + " is washing the dishes.");
    }
}


/*
name (String),
employeeID (int), hourlyRate (double), fullTime (boolean)
makeOrder(): chef's
name + "is making an order"
                washDishes(): chef's
name + "is washing the dishes"
 */
