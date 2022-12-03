package week13_12_03_2022.encapsulation;

public class Student {

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.out.println("Invalid name: " + name);
            return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Invalid age: " + age);
            return;
        }
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
