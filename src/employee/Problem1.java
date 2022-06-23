package employee;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Employee {
    private String name;
    private Long id;
    Predicate<Employee> employeePredicate = e -> this.equals(e);
    Predicate<Employee> employeePredicate2 = this::equals;

    public Employee(final String name, final Long id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Tmo", 102L);
        e.evaluator();
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final Employee employee = (Employee) o;
        return Objects.equals(this.name, employee.name) && Objects.equals(this.id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.id);
    }

    public void evaluator() {

        System.out.println(employeePredicate.test(new Employee("Tmo", 102L)));
        System.out.println(employeePredicate2.test(new Employee("Tmo", 102L)));
        System.out.println(new Inner().test(new Employee("Tmo", 102L), new Employee("Tmo", 102L)));
    }

    public static class Inner implements BiPredicate<Employee, Employee> {

        @Override
        public boolean test(Employee employee, Employee employee2) {
            return employee.equals(employee2);
        }
    }
}