package Java_Core_Classes.day35_Encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Canan", 25, 'F', "Turkish");

        person1.eat();
        person1.drink();
        System.out.println(person1);

        Person.printPlanetName();
    }
}
