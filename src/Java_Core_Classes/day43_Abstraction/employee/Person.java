package Java_Core_Classes.day43_Abstraction.employee;

public abstract class Person {

    private String name;
    private final char gender;
    private int age;

    public Person(String name, char gender, int age) {
        setName(name);
        if (!(gender == 'M' || gender == 'F')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public  void eat(){
        System.out.println(name + " eats baklava");
    }
    public abstract void sleep();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
