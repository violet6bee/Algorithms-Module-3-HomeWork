public class Person implements Comparable{
        private String name;
        private int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person)) {
            throw new ClassCastException();
        }
        Person otherPerson = (Person) o;
        return Integer.compare(age, otherPerson.age);
    }
}
