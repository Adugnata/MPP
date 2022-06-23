package tri;

@FunctionalInterface
interface Triface<S, T, U, R> {
    R apply(S s, T t, U u);

}

public class TriFunction implements Triface<Integer, Integer, Integer, Integer> {
    Triface<Integer, Integer, Integer, Integer> t = (x, y, z) -> x + y + z;
    Triface<Integer, Integer, Integer, Integer> t2 = TriFunction::sum;

    static Integer sum(Integer x, Integer y, Integer z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        TriFunction triFunction = new TriFunction();
        triFunction.evaluator();
    }

    @Override
    public Integer apply(Integer integer, Integer integer2, Integer integer3) {
        return integer + integer2 + integer2;
    }

    public void evaluator() {
        System.out.println(new TriFunction().apply(4, 4, 4));
        System.out.println(t.apply(3, 4, 5));
        System.out.println(t2.apply(10, 3, 4));

    }
}

