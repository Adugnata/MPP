package lesson9.part2.prob10.a;

import java.util.*;

public class Or {

    public static void main(String[] args) {
        List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
        System.out.println(Or.someSimpleIsTrue(list));

    }

    public static boolean someSimpleIsTrue(List<Simple> list) {
        return list.stream()
                .reduce(false, (p, c) -> p || c.flag, (p, c) -> p || c);
    }

}
