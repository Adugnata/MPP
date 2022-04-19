package lesson11.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T extends Comparable<T>> T secondSmallest(List<T> list) {
        if (1 < list.size())
            return list.stream()
                    .sorted()
                    .distinct()
                    .limit(2)
                    .max(Comparable::compareTo)
                    .orElse(null);
        else
            return null;
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(2, 2, 3, 4, 5));
        List<String> strings = new ArrayList<>(Arrays.asList("X", "X", "Y", "Y", "Z"));
        System.out.println(secondSmallest(integers));
        System.out.println(secondSmallest(strings));

    }
}
