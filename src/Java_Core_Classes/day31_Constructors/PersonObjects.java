package Java_Core_Classes.day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Canan", 'F', 38);
        Person person2 = new Person("Ali", 'M', 44);

        person2.age = 34;

        System.out.println(person1);
        System.out.println(person2);
    }
}
