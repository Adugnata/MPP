package lesson9.exer.exe2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(3, 5, 2, 3, 8);
        List<int[]> intarrs = ints.stream()
                .map(int[]::new)
                .toList();
        List<String> intArrsStr = intarrs.stream()
                .map(Arrays::toString)
                .toList();
        System.out.println();

    }
}
