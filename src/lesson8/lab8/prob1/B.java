package lesson8.lab8.prob1;

import java.util.function.Supplier;

public class B {
    public static void main(String[] args) {
        Supplier<Double> supplier = Math::random; //Class::staticmethod
        System.out.println(supplier.get());
        /**
         *  i. Rewrite this method reference as a lambda expression
         */
        Supplier<Double> random = () -> Math.random();
        /**
         * Put this method expression in a main method in a
         * Java class and use it to print a random number to the console
         */
        System.out.println(random.get());
        /**
         * iii. Create an equivalent Java class in which the functional behavior
         * of Math::random is expressed using an inner class (implementing Supplier);
         * call this inner class from a main method and use it to output a random number
         * to the console. The behavior should be the same as in part ii.
         */
        Supplier<Double> supplier1 = new Supply();
        System.out.println(supplier1.get());
    }

    static final class Supply implements Supplier<Double> {

        @Override
        public Double get() {
            return Math.random();
        }
    }
}
