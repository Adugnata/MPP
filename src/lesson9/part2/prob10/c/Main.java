package lesson9.part2.prob10.c;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    private static final Function<List<Integer>, Stream<Integer>>
            intStream = Collection::stream;

    public static Stream<Integer> cloneStream(List<Integer> integerList) {
        return integerList.stream();
    }

    public static void main(String[] args) {
        List<Integer> myIntStream = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Reuse stream by using lambda Functors
        intStream.apply(myIntStream).max(Comparable::compareTo).ifPresent(System.out::println);
        intStream.apply(myIntStream).min(Comparable::compareTo).ifPresent(System.out::println);

        // Reuse stream by placing stream generation code inside a method
        cloneStream(myIntStream).max(Integer::compareTo).ifPresent(System.out::println);
        cloneStream(myIntStream).min(Integer::compareTo).ifPresent(System.out::println);
    }

}
