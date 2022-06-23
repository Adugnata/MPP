package lesson8.lab8.prob6;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Examples {


    //type: Class::instanceMethod
    Function<String, String> upper1 = (String x) -> x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;
    //(Employee e) -> e.getName();
    Function<Employee, String> get1 = e -> e.getName();
    Function<Employee, String> get2 = Employee::getName; //Class::instanceMethod

    //(Employee e,String s) -> e.setName(s);
    BiConsumer<Employee, String> set1 = (e, s) -> e.setName(s);
    BiConsumer<Employee, String> set2 = Employee::setName;//Class:instanceMethod

    //(String s1,String s2) -> s1.compareTo(s2);
    Comparator<String> compare1 = (s1, s2) -> s1.compareTo(s2);
    Comparator<String> compare2 = String::compareTo; //Class::instanceMethod

    //(Integer x,Integer y) -> Math.pow(x,y);
    BiFunction<Double, Double, Double> pow1 = (x, y) -> Math.pow(x, y);
    BiFunction<Double, Double, Double> pow2 = Math::pow;//Class::staticMethod

    //(Apple a) -> a.getWeight();
    Function<Apple, Double> getWeight1 = e -> e.getWeight();
    Function<Apple, Double> getWeight2 = Apple::getWeight;//Class::instanceMethod

    //(String x) -> Integer.parseInt(x);
    Function<String, Integer> parse1 = x -> Integer.parseInt(x);
    Function<String, Integer> parse2 = Integer::parseInt;//Class::staticMethod

    EmployeeNameComparator comp = new EmployeeNameComparator();
    //(Employee e1, Employee e2) -> comp.compare(e1,e2);
    Comparator<Employee> employeeComparator1 = (e1, e2) -> comp.compare(e1, e2);
    Comparator<Employee> employeeComparator2 = comp::compare;//Class::instanceMethod

    public static void main(String[] args) {
        Examples e = new Examples();
        e.evaluator();

    }

    public void evaluator() {
        String s1 = "Hi";
        String s2 = "Hello";
        Employee el = new Employee("Joe", 100000);
        Employee e2 = new Employee("John", 100000);
        Apple apple = new Apple(2.5);
        System.out.println(upper2.apply(s1));
        System.out.println(get2.apply(e2));
        System.out.println(compare2.compare(s1, s2));
        System.out.println(pow2.apply(2.0, 9.0));
        System.out.println(getWeight2.apply(apple));
        System.out.println(parse2.apply("42"));
        System.out.println(employeeComparator2.compare(el, e2));
    }

}
