package practice6;

import lesson9.exer.exercise_5.ExamData;

import java.util.*;
import java.util.function.Function;
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

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		//implement here
		System.out.println("\n1) Use the Collectors.joining method to print out All Employee objects, " +
				"and separate each one with a delimiter of “---\\n---“.\n");
		System.out.println(
				list.stream()
				.map(Employee::toString)
				.collect(Collectors.joining("---\n---"))
		);
		System.out.println("\n2) Print a list of both the capital and non capital lastnames of employees using stream concatenation.\n");

		Stream<String> lastnameCapital = list.stream().map(e-> e.getLastName().toUpperCase());
		Stream<String> lastname = list.stream().map(Employee::getLastName);
		Stream.concat(lastnameCapital,lastname).forEach(System.out::println);

		System.out.println("\n4) Calculate sum of Employee salaries with Stream reduce method.\n");

        double totalSalary = list.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println("Total Employee Salary = " + totalSalary);

        System.out.println("\nAverage of Employee salaries with DoubleStream average method.\n");

        DoubleSummaryStatistics statistics = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Employee Salary = "+ statistics.getAverage());

        System.out.println("\n Count number of Employees in each department.\n");
        Map<String, Long>
                countByDepartment = list.stream().collect(
                        Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(countByDepartment);

        System.out.println("\nPrint out each department and the average salary for the department.\n");
        Map<String, Double>
                avgSalaryByDepartment = list
				.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalaryByDepartment);

        System.out.println("\n8) Print out each department and all of the employees who work at that department.\n");
        Map<String, List<Employee>> empByDepartment = list
				.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(empByDepartment);

	}}


