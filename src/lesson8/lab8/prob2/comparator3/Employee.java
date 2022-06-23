package lesson8.lab8.prob2.comparator3;

import java.util.Objects;

public class Employee {
    String name;
    int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary + ">");
        return sb.toString();

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

