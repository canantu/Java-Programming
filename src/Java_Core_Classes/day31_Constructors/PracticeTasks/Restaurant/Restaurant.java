package Java_Core_Classes.day31_Constructors.PracticeTasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner, Location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numberOfStars) {
        Owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }

    public void hireServer(Server[] serverArr){
        servers.addAll(Arrays.asList(serverArr));
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefArr){
        chefs.addAll(Arrays.asList(chefArr));
    }

    public void terminateChef(int employeeId){
        chefs.removeIf(p->p.employeeID == employeeId);
    }

    public void terminateServer(int employeeId){
        servers.removeIf(p->p.employeeID == employeeId);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers +
                ", chefs=" + chefs +
                '}';
    }
}
/*
Attributes:
                Owner (String), Location (String),
numberOfStars (int)
                Servers (ArrayList of Server
objects)
                Chefs (ArrayList of Chef objects)
Methods:
                hireServer(Server server): accepts
a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers):
accepts an array of Server objects and adds all of them to the Servers
ArrayList
                hireChef(Chef chef): accepts a chef
object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an
array of Chef objects and adds all of them to the Chef ArrayList
                terminateChef(int employeeID):
removes the chef with the matching ID from the arraylist of chef
                terminateServer(int employeeID)
removes the server with the matching ID from the arraylist of server
 */