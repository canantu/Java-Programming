package Java_Core_Classes.day35_Encapsulation.Practice_Tasks;

import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!Arrays.asList("small", "medium", "large").contains(size)){
            System.out.println("Invalid size: " + size);
            return;
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0){
            System.out.println("Invalid number: " + numberOfCheeseTopping);
            return;
        }
        if (size == "small" && numberOfCheeseTopping > 3){
            System.out.println("Number of cheese toppings can not be larger than 3");
            return;
        }else if (size == "medium" && numberOfCheeseTopping > 4){
            System.out.println("Number of cheese toppings can not be larger than 4");
            return;
        } else if (size == "large" && numberOfCheeseTopping > 5) {
            System.out.println("Number of cheese toppings can not be larger than 5");
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0){
            System.out.println("Invalid number: " + numberOfPepperoniTopping);
            return;
        }
        if (size == "small" && numberOfPepperoniTopping > 4){
            System.out.println("Number of pepperoni toppings can not be larger than 4");
            return;
        }else if (size == "medium" && numberOfPepperoniTopping > 5){
            System.out.println("Number of pepperoni toppings can not be larger than 5");
            return;
        } else if (size == "large" && numberOfPepperoniTopping > 6) {
            System.out.println("Number of pepperoni toppings can not be larger than 6");
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public double calcCost(){
        double totalPrice = 0;
        if (size.equals("small"))
            totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        else if (size.equals("medium"))
            totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        else if (size.equals("large"))
            totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);

        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice=" + calcCost() +
                '}';
    }
}
