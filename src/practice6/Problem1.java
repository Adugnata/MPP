package practice6;

import java.util.Comparator;
import java.util.Random;
import java.util.function.Supplier;

public class Problem1 {
    static Random r = new Random();
    Supplier<Integer> r1 = () -> r.nextInt();
    Supplier<Integer> r2 = Problem1::check;
    static Integer check(){
            return r.nextInt();
        }

    public void evaluator() {
        System.out.println(r1.get());
        System.out.println(r2.get());
    }

    public static void main(String[] args) {
        Problem1 p = new Problem1();
        p.evaluator();
    }
}
