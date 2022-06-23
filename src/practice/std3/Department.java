package practice.std3;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Person> persons;

    public Department(String name) {
        this.name = name;
        this.persons = new ArrayList<>();

    }

    public void addPerson(Person p) {
        this.persons.add(p);
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    public void showAllMembers() {
        for (Person p : persons) {
            System.out.print("Name: " + p.getName() + " phone: " + p.getPhone() + " age: " + p.getAge() + " role: ");
            for (Role pRole : p.getRoles())
                System.out.print(pRole.getClass().getSimpleName() + " ");
            System.out.println("\n");
        }
    }

    public void unitsPerFaculty() {
        for (Person p : persons)
            for (Role pRole : p.getRoles())
                if (pRole instanceof Faculty) {
                    System.out.println("Name: " + p.getName() + " Units: " + pRole.getUnits() + "\n");
                }
    }

    public double getTotalSalary() {
        double sumSalary = 0.0;
        for (Person p : persons)
            for (Role pRole : p.getRoles())
                sumSalary += pRole.getSalary();
        return sumSalary;
    }
}
