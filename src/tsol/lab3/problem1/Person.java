package tsol.lab3.problem1;


public class Person {

    private String name;

    Person(String n) {
        name = n;
    }

    public static void main(String[] args) {

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object aPerson) {
        if (aPerson == null) return false;
        if (!(aPerson instanceof Person)) return false;
        Person p = (Person) aPerson;
        boolean isEqual = this.name.equals(p.name);
        return isEqual;
    }

}