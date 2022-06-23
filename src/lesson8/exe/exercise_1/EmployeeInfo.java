package lesson8.exe.exercise_1;

import java.util.*;

public class EmployeeInfo {
    private SortMethod method;
    ;

    public EmployeeInfo(SortMethod method) {
        this.method = method;
    }

    public static void sort(List<Employee> lists, final SortMethod m) {
        class EmployeeComparator implements Comparator<Employee> {

            @Override
            public int compare(Employee o1, Employee o2) {
                return m.equals(SortMethod.BYNAME) ? o1.name.compareTo(o2.name) : Double.compare(o1.salary, o2.salary);
            }
        }
        lists.sort(new EmployeeComparator());
    }

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Joe", 100000));
        emps.add(new Employee("Joe", 50000));
        emps.add(new Employee("Andy", 60000));
        Employee joe = new Employee("Joe", 100000);
        Employee joe2 = new Employee("Joe", 200000);
        sort(emps, SortMethod.BYSALARY);
        System.out.println(emps);
		/*List<Employee> list = Arrays.asList(joe, joe2);
		Collections.sort(list, new EmployeeNameComparator());
		System.out.println(list);


		System.out.println("joe equals joe2? " + joe.equals(joe2));
		EmployeeNameComparator c = new EmployeeNameComparator();
		System.out.println("joe equals joe2? " + (c.compare(joe, joe2)==0) );
*/

		/*
		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);*/
    }

    //Comparators are unaware of the value in method
    public void sort(List<Employee> emps) {
        if (method == SortMethod.BYNAME) {
            Collections.sort(emps, new EmployeeNameComparator());
        } else if (method == SortMethod.BYSALARY) {
            Collections.sort(emps, new EmployeeSalaryComparator());
        }
    }

    enum SortMethod {BYNAME, BYSALARY}
}

	
