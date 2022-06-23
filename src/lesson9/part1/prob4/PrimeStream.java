package lesson9.part1.prob4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
    private final Stream<Integer> primes = Stream.iterate(2, n -> {
        boolean nextPrimeFound = false;
        int nextInt = n + 1;
        while (!nextPrimeFound) {
            int i = 2;
            for (; i < Math.sqrt(nextInt); i++)
                if (nextInt % i == 0) break;
            if (i > Math.sqrt(nextInt)) nextPrimeFound = true;
            else
                nextInt++;
        }
        return nextInt;
    });

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }

    private Stream<Integer> getPrimeStream() {
        return Stream.iterate(2, n -> {
            boolean nextPrimeFound = false;
            int next = n + 1;
            while (!nextPrimeFound) {
                int counter = 2;
                for (; counter < Math.sqrt(next); counter++)
                    if (next % counter == 0) break;
                if (counter > Math.sqrt(next)) nextPrimeFound = true;
                else next++;
            }
            return next;
        });
    }

    public void printFirstNPrimes(long n) {
        if (n <= 0) return;
        System.out.println(getPrimeStream().limit(n).collect(Collectors.toList()));
    }
}