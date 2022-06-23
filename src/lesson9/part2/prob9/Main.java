package lesson9.part2.prob9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void printSquares(int num) {
        int[] square = IntStream
                .iterate(1, n -> (int) (2 * Math.sqrt(n) + n + 1))
                .limit(num).toArray();
        System.out.println(Arrays.toString(square));
    }

    public static void main(String[] args) {
        printSquares(4);

    }
}
