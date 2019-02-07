package HW_Person;

public class PersonImpl implements Person{
    private final String name;
    private final int age;
    private Person spouse = null;
    private final boolean sex; // true = female

    public PersonImpl (String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public boolean getSex() {
        return sex;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setSpouse(Person person) {
        spouse = person;
    }

    @Override
    public Person getSpouse() {
        return spouse;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public boolean marry(Person person) {
        if ((sex != person.getSex()) && (age >= 18) && (person.getAge() >= 18)){
            if (spouse != null) {
                this.divorce();
            }
            if (person.getSpouse() != null) {
                person.divorce();
            }
            spouse = person;
            person.setSpouse(this);
            System.out.println("Наш персонаж " + name + " успешно вступил в брак с " + spouse.getName());
            System.out.println();
            return true;
        }
        else {
            if (sex == person.getSex()){
                System.out.println("Нельзя женить однополых персонажей!");
                System.out.println();
            }
            if (age < 18){
                System.out.println("Наш персонаж " + name + " еще слишком мал для брака!");
                System.out.println();
            }
            if (person.getAge() < 18){
                System.out.println("Жених/невеста нашего персонажа " + person.getName() + " еще слишком мал для брака!");
                System.out.println();
            }
            System.out.println("По приведенной выше причине наш персонаж " + name + " не может вступить в брак с " + person.getName());
            System.out.println();
            return false;
        }
    }

    @Override
    public void divorce() {
        if (spouse != null){
            System.out.println("Наш персонаж " + name + " успешно разведен с " + spouse.getName());
            System.out.println();
            spouse = null;
            spouse.setSpouse(null);
        }
        else {
            System.out.println("Наш персонаж " + name + " итак не состоит в браке");
            System.out.println();
        }
    }
}
