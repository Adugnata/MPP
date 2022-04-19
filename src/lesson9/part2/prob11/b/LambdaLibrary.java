package lesson9.part2.prob11.b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Integer, Character, String> query = (employees, s, r) -> employees
            .stream()
            .filter(e -> e.getSalary() > s)
            .filter(e -> e.getLastName().charAt(0) > r)
            .map(e -> (new StringBuilder()).append(e.getFirstName()).append(" ").append(e.getLastName()))
            .sorted(Comparator.comparing(String::new))
            .collect(Collectors.joining(", "));
}
