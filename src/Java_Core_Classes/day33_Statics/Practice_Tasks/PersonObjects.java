package Java_Core_Classes.day33_Statics.Practice_Tasks;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Canan", 38, 'F');

        System.out.println(person1);

        person1.eat("Kofte");
        person1.drink("Ayran");
        person1.sleep();
    }
}
