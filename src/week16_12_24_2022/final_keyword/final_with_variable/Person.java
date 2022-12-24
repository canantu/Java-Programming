package week16_12_24_2022.final_keyword.final_with_variable;

public class Person {

    private String name;
    private final String birthDay;

    public Person(String name, String birthDay) {
        setName(name);
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
