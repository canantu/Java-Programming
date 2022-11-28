package Java_Core_Classes.day35_Encapsulation.Encapsulation;

public class PersonObject {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Daniel");
        person1.setAge(-26);

        //person1.name = "Daniel";  // no direct setting the private variables
        //person1.age = 28;

        System.out.println(person1.getName() + ": " + person1.getAge());


    }
}
