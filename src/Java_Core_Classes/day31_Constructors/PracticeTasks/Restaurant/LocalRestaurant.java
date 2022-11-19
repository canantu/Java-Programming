package Java_Core_Classes.day31_Constructors.PracticeTasks.Restaurant;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server server1 = new Server("Canan", 123, 10, true);
        Server server2 = new Server("Ali", 124, 15, false);
        Server server3 = new Server("Alim", 125, 12, true);
        Server server4 = new Server("Can", 126, 14, false);

        Chef chef1 = new Chef("Alp", 127, 20, true);
        Chef chef2 = new Chef("Ahmet", 128, 25, true);
        Chef chef3 = new Chef("Caner", 129, 22, false);
        Chef chef4 = new Chef("Cafer", 130, 30, true);

        Server[] serverArr = {server1, server2, server3, server4};
        Chef[] chefArr = {chef1, chef2, chef3, chef4};

        Restaurant restaurant1 = new Restaurant("Canan", "Berlin", 5);

        restaurant1.hireServer(serverArr);
        restaurant1.hireChef(chefArr);


        System.out.println(restaurant1);


    }
}