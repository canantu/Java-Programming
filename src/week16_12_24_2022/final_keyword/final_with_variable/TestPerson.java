package week16_12_24_2022.final_keyword.final_with_variable;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person("Adam", "14-01-1989");
      //  person.birthDay = "12-02-1989";  unchangeable because birthDay is final

        System.out.println(person.getBirthDay());
        person.setName("Eve");
        System.out.println(person);





    }
}
