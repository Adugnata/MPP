package practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Department {
    private final String name;
    private final List<Person> persons;

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
        this.persons.stream()
                .map(p -> "Name: " + p.getName()
                        + " phone: " + p.getPhone()
                        + " age: " + p.getAge()
                        + " role: " + p.getRoles().stream()
                        .map(r -> r.getClass().getSimpleName())
                        .collect(Collectors.joining(", ")))
                .forEach(e -> System.out.println("\n" + e));
    }

    public void unitsPerFaculty() {
        persons.stream()
                .flatMap(p -> p.getRoles().stream()
                        .filter(r -> r instanceof Faculty)
                        .map(f -> (new StringBuilder())
                                .append("Name: ")
                                .append(p.getName())
                                .append(" Units: ")
                                .append(f.getUnits())
                                .append("\n").toString()))
                .forEach(System.out::println);
    }

    public void showStudentsByFaculty(final String name) {
        final Supplier<Set<String>> facultyCourseIds = () -> this.persons.stream()
                .filter(p -> 0 == p.getName().compareTo(name))
                .flatMap(p -> p.getRoles().stream())
                .filter(r -> r instanceof Faculty)
                .flatMap(r -> ((Faculty) r).getCourses().stream().map(Course::getId))
                .collect(Collectors.toSet());

        List<String> students = persons.stream()
                .filter(p -> (!p.getRoles()
                        .stream()
                        .filter(r -> r instanceof Student)
                        .flatMap(r -> ((Student) r).getCourses().stream().map(Course::getId))
                        .filter(facultyCourseIds.get()::contains).collect(Collectors.toSet()).isEmpty()))
                .map(Person::getName)
                .toList();
        System.out.printf("List of Student taking courses from Faculty %s: \n", name);
        final AtomicInteger i = new AtomicInteger(1);
        students.forEach(student -> System.out.println("\t" + i.getAndIncrement() + ". " + student));
    }

    public double getTotalSalary() {
        return persons.stream()
                .flatMap(p -> p.getRoles().stream())
                .map(s -> s.getSalary())
                .reduce(0.0, Double::sum);

    }
}
