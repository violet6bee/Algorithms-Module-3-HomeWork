import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    Person person1 = new Person("Pavel", 34);
    Person person2 = new Person("Olga", 22);
    Person person3 = new Person("Sasha", 30);
    ArrayList<Person> personList = new ArrayList<>();
    personList.add(person1);
    personList.add(person2);
    personList.add(person3);
    PersonComparator personComparator = new PersonComparator();
    System.out.println(Collections.binarySearch(personList, person3));
    System.out.println(Collections.binarySearch(personList, person3, personComparator));
    }
}