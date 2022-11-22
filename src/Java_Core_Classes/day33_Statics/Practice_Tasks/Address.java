package Java_Core_Classes.day33_Statics.Practice_Tasks;

public class Address {

    public String street;
    public String city;
    public String state;
    public int zipCode;
    public static String country = "Turkey";
    public static String planet = "Earth";

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return street + "\n" + city + " " + state + ", " + zipCode;
    }
}
