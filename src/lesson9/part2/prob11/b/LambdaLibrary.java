package lesson9.part2.prob11.b;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> query = (employees, s, r) -> employees
            .stream()
            .filter(e -> e.getSalary() > s && e.getLastName().charAt(0) > r)
            .map(e -> e.getFirstName() + " " + e.getLastName())
            .sorted()
            .collect(Collectors.joining(", "));
}
