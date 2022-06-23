package lesson11.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        return list.stream()
                .sorted()
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(null);


    }

    public static <T extends Comparable<? super T>> T max(List<T> list) {
        return list
                .stream()
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElse(null);
    }

    public static <T extends Comparable<? super T>> T min(List<T> list) {
        return list
                .stream()
                .sorted()
                .findFirst()
                .orElse(null);
    }

    public static <T extends Comparable<? super T>> long smallest(List<T> list, T e) {
        return list
                .stream()
                .filter(i -> i.compareTo(e) < 0)
                .count();
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        List<String> strings = new ArrayList<>(Arrays.asList("X", "X", "Y", "Y", "Z"));
        List<LocalDate> localDates = Arrays.asList(LocalDate.ofEpochDay(0), LocalDate.ofEpochDay(1), LocalDate.ofEpochDay(2));
        System.out.println(secondSmallest(integers));
        System.out.println(secondSmallest(strings));
        System.out.println(secondSmallest(localDates));
        System.out.println(secondSmallest(new ArrayList<Integer>()));
        System.out.println(min(localDates));
        System.out.println(smallest(strings, "Z"));

    }
}
