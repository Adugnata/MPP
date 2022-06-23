package practice4;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Problem1 {
    Comparator<String> s1 = (s1, s2) -> s1.compareTo(s2);
    Comparator<String> s3 = String::compareTo;
    Comparator<String> s2 = Problem1::check;
    BiFunction<Double, Double, Double> funct = (x, y) -> x * y;
    Consumer<? super Object> out = System.out::println;
    BinaryOperator<Integer> bo = (x, y) -> x + y;
    BinaryOperator<Integer> bo2 = Integer::sum;

    private static int check(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.evaluator();
    }

    //evaluate with String inputs: “Hello”, “Allo”
    public void evaluator() {
        out.accept(s1.compare("Hello", "Allo"));
        out.accept(s2.compare("Hello", "Allo"));
        out.accept(new Inner().compare("Hello", "Allo"));
        out.accept(bo.apply(1, 2));
        out.accept(bo2.apply(5, 6));
    }

    static class Inner2 implements BiFunction<Double, Double, Double> {

        @Override
        public Double apply(Double aDouble, Double aDouble2) {
            return aDouble + aDouble2;
        }
    }

    static class Inner3 implements BinaryOperator<Integer> {

        @Override
        public Integer apply(Integer integer, Integer integer2) {
            return integer + integer2;
        }
    }

    static class Inner implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
}