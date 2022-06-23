package practice6;

import java.util.Random;
import java.util.function.Supplier;

public class Problem1 {
    static Random r = new Random();
    Supplier<Integer> r1 = () -> r.nextInt(); // lambada expression
    Supplier<Integer> r2 = r::nextInt;//Object:instancemethod

    public void evaluator() {
        System.out.println(r1.get());
        System.out.println(r2.get());
        System.out.println(new Rand().get());
    }

    static class Rand implements Supplier<Integer> {//static inner class

        @Override
        public Integer get() {
            return r.nextInt();
        }
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.evaluator();
    }
}
