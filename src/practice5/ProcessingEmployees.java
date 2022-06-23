package practice5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		//implement here
		System.out.println("\n1) Display Employees with salaries in the range $4000-$6000 sorted into ascending order by salary.\n");

		list.stream()
				.filter((e) -> e.getSalary() >= 4000 && e.getSalary() <= 6000)
				.forEach(System.out::println);

		System.out.println("\n2) Display first Employee with salary in the range $4000-$6000.\n");

		Optional<Employee> employee = list.stream()
				.filter((e) -> e.getSalary() >= 4000 && e.getSalary() <= 6000)
				.findFirst();
		employee.ifPresent(System.out::println);

		System.out.println("\n3) Create two types of Function (functional interfaces) for getting first and last names from an Employee. Create a\n" +
				"type of Comparator for comparing Employees by first name then last name. Sort employees by last name, then\n" +
				"first name using created types. \n");

		Function<Employee, String> firstName = Employee::getFirstName;
		Function<Employee, String> lastName = Employee::getLastName;
		list
				.stream()
				.sorted(Comparator.comparing(lastName).thenComparing(firstName))
				.forEach(System.out::println);

		System.out.println("4) Sort employees in descending order by last name, then first name.\n");

		list
				.stream()
				.sorted(Comparator.comparing(lastName).thenComparing(firstName))
				.forEach(System.out::println);

		System.out.println("\n5) Display unique employee last names sorted\n");

		list.stream()
				.map(Employee::getLastName)
				.sorted()
				.distinct()
				.forEach(System.out::println);

		System.out.println("\n6) Display only first and last names. \n");

		list.stream()
				.map(e -> (new StringBuilder()).append(e.getFirstName()).append("\t").append(e.getLastName()))
				.forEach(System.out::println);

		System.out.println("\n7) Print out all the distinct last names whose last name starts with I.\n");

		list.stream()
				.map(Employee::getLastName)
				.filter((s) -> s.startsWith("I"))
				.distinct()
				.forEach(System.out::println);
	}//
} // end class ProcessingEmployees

