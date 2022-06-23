package lesson8.exe.exercise_3;

import java.util.Comparator;
import java.util.function.*;

public class Examples {


    //type: Class::instanceMethod
    Function<String, String> upper1 = (String x) -> x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;
    //	(Employee e) -> e.getName();
    Function<Employee, String> get1 = e -> e.getName();
    Function<Employee, String> get2 = Employee::getName; //ClassName::instanceMethod

    //(Employee e,String s) -> e.setName(s);
    BiConsumer<Employee, String> set1 = (e, s) -> e.setName(s);
    BiConsumer<Employee, String> set2 = Employee::setName;

    //(String s1,String s2) -> s1.compareTo(s2);
    Comparator<String> compare1 = (s1, s2) -> s1.compareTo(s2);
    Comparator<String> compare2 = String::compareTo; //Class::instanceMethod

    //(Integer x,Integer y) -> Math.pow(x,y);
    BiConsumer<Integer, Integer> pow1 = (x, y) -> Math.pow(x, y);
    BiConsumer<Integer, Integer> pow2 = Math::pow;//Class::staticMethod

    //(Apple a) -> a.getWeight();
    Consumer<Apple> getWeight1 = e -> e.getWeight();
    Consumer<Apple> getWeight2 = Apple::getWeight;//Class::instanceMethod

    //(String x) -> Integer.parseInt(x);
    Consumer<String> parse1 = x -> Integer.parseInt(x);
    Consumer<String> parse2 = Integer::parseInt;//Class::staticmethod

    EmployeeNameComparator comp = new EmployeeNameComparator();
    //(Employee e1, Employee e2) -> comp.compare(e1,e2);
    Comparator<Employee> employeeComparator1 = (e1, e2) -> comp.compare(e1, e2);
    Comparator<Employee> employeeComparator2 = comp;//Class::instancemethod

    public static void main(String[] args) {
        Examples e = new Examples();
        e.evaluator();

    }

    public void evaluator() {
/*        System.out.println(upper2.apply("hello"));
		System.out.println(get1.apply(new Employee("Joe", 100000)));
		System.out.println(get2.apply(new Employee("Joe", 100000)));
		set1.accept(new Employee("Joe", 100000),"John");
		set2.accept(new Employee("Joe", 100000),"John");
        System.out.println(compare1.compare("Hi","Hello"));
        System.out.println(compare2.compare("Hi","Hello"));*/
        System.out.println(employeeComparator1.compare(new Employee("Joe", 100000), new Employee("John", 100000)));

    }

}
