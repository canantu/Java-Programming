package week13_12_03_2022.encapsulation;

public class Teacher {

    public String name;
    public int age;

    public Teacher(String name, int age){

        setAge(age);
        setName(name);
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Invalid name: " + name);
            return;
        }
        this.name = name;
    }

    public void setAge(int age) {

        if (age <= 0){
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
