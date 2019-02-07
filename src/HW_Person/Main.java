package HW_Person;

public class Main {
    public static void main(String[] args) {
        Person dima = new PersonImpl("Дима", 20, false);
        Person sveta = new PersonImpl("Света", 19, true);
        Person julia = new PersonImpl("Юля", 15, true);
        Person artem = new PersonImpl("Артем", 45, false);

        dima.marry(sveta);
        System.out.println("***проверяем***");
        System.out.println(dima.getName() + " в браке с " + dima.getSpouse().getName());
        System.out.println("***проверяем***");

        sveta.marry(artem);
        System.out.println("***проверяем***");
        System.out.println(sveta.getName() + " теперь в браке с " + sveta.getSpouse().getName());
        if (dima.getSpouse() == null) {
            System.out.println(dima.getName() + " остался один");
        }
        System.out.println("***проверяем***");

        artem.divorce();
        System.out.println("***проверяем***");
        if ((artem.getSpouse() == null) && (sveta.getSpouse() == null)) {
            System.out.println(artem.getName() + " остался один");
            System.out.println(sveta.getName() + " осталась одна");
        }
        System.out.println("***проверяем***");

        sveta.marry(julia);
        System.out.println("***проверяем***");
        if ((julia.getSpouse() == null) && (sveta.getSpouse() == null)) {
            System.out.println(sveta.getName() + " все еще одна");
            System.out.println(julia.getName() + " все еще одна");
        }
        System.out.println("***проверяем***");
    }
}
