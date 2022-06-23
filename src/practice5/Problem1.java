package practice5;

import java.util.function.BiPredicate;

public class Problem1 {
    BiPredicate<Double, Double> lessThan1 = (s1, s2) -> s1 * s2 < s1 + s2;
    BiPredicate<Double, Double> lessThan = Problem1::check;

    private static boolean check(double s1, double s2) {
        return s1 * s2 < s1 + s2;
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.evaluator();
    }

    public void evaluator() {

        System.out.println(lessThan.test(2.0, 3.0));
        System.out.println(new Inner().test(3.2, 4.5));
    }

    public static class Inner implements BiPredicate<Double, Double> {
        @Override
        public boolean test(Double x, Double y) {
            return x * y < x + y;
        }
    }
}
