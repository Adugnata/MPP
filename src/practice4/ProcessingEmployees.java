package practice4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingEmployees {
    public static void main(String[] args) {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("Indigo", "Indigo", 3587.5, "Sales"),
                new Employee("Indra", "Matthew", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        /**
         * 1) get List view of the Employees
         */
        List<Employee> list = Arrays.asList(employees);
        Consumer<? super Object> print = System.out::println;
        print.accept("");
        // display all Employees
        System.out.println("Complete Employee list:");
        list.forEach(print);   //A method reference.
        print.accept("");
        //implement here
        /**
         * 2) Print out only the first names of all the employees.
         */
        list.parallelStream()
                .map(Employee::getFirstName)
                .forEach(print);
        /**
         * 3) Count the number of last names that begin with the letter ‘B’. Print out this number.
         */
        long count = list.parallelStream()
                .filter(e -> e.getLastName().startsWith("B"))
                .count();
        System.out.println(count);
        /**
         * 4) Print out all the Employee objects whose last name begins with the letter ‘B’.
         */
        list.parallelStream()
                .filter(e -> e.getLastName().startsWith("B"))
                .forEach(print);
        /**
         * 5) Print out All of the employee objects, but if the last name begins with the letter ‘I’,
         * then capitalize all the letters in the last name.
         */
        list.parallelStream()
                .map(e ->
                        {
                            Employee x = new Employee(e.getFirstName(), e.getLastName(), e.getSalary(), e.getDepartment());
                            if (e.getLastName().startsWith("I"))
                                x.setLastName(e.getLastName().toUpperCase());
                            return x;
                        }
                ).forEach(print);
        System.out.println();
        /**
         * 6) Create a List<Employee> the Employee objects whose last name begins with the letter ‘G’
         * and their first name
         * and last name to be All capital letters
         */
        List<Employee> employeeList = list.parallelStream()
                .filter(e -> e.getLastName().startsWith("G"))
                .map(e -> {
                    Employee x = new Employee(e.getFirstName(), e.getLastName(), e.getSalary(), e.getDepartment());
                    x.setLastName(e.getLastName().toUpperCase());
                    x.setFirstName(e.getFirstName().toUpperCase());
                    return x;
                })
                .collect(Collectors.toList());
        /**
         * 7) Print out all the Employee objects’ last names, whose last name begins with the letter ‘I’,
         * but First name does not begin with the letter ‘I’. Print out only the last names.
         */
        list.stream()
                .filter(e -> e.getLastName().startsWith("I") && !e.getFirstName().startsWith("I"))
                .map(e -> e.getLastName())
                .forEach(print);
        /**
         * 8) Create an infinite stream of even numbers (0, 2, 4, …) and then,
         * eventually print out only the first 20 even numbers from this stream.
         */
        Stream<Integer> stream2 = Stream.iterate(0, n -> n + 2).limit(20);
        stream2.forEach(e -> System.out.print(e + ", "));
        /**
         * 9) Display Employees with salaries in the range $4000-$6000.
         */
        System.out.println();
        list.stream()
                .filter(e -> e.getSalary() >= 4000 && e.getSalary() <= 6000)
                .forEach(print);
        /**
         * 9) Display Employees in IT department.
         */
        System.out.println();
        list.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .forEach(print);
        print.accept("Sort employee by salary");
        list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(print);
    }//
} // end class ProcessingEmployees

