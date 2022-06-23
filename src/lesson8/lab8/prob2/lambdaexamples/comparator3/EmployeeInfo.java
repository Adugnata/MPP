package lesson8.lab8.prob2.lambdaexamples.comparator3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo();
		ei.sort(emps, SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, SortMethod.BYSALARY);
		System.out.println(emps);
	}

	;

	public void sort(List<Employee> emps, SortMethod method) {
		Collections.sort(emps, (e1, e2) ->
		{
			if (method == SortMethod.BYNAME) {
				if (e1.name.compareTo(e2.name) != 0)
					return e1.name.compareTo(e2.name);
				return Double.compare(e1.salary, e2.salary);
			} else {
				if (Double.compare(e1.salary, e2.salary) != 0)
					return Double.compare(e1.salary, e2.salary);
				return e1.name.compareTo(e2.name);
			}
		});
	}

	static enum SortMethod {BYNAME, BYSALARY}
}
