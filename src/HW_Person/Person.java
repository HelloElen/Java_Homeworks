package HW_Person;

public interface Person {
    boolean marry (Person person);

    void divorce();

    Person getSpouse();

    boolean getSex();
    int getAge();
    void setSpouse(Person person);
    String getName();
}
