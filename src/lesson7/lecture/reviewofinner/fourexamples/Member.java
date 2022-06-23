package lesson7.lecture.reviewofinner.fourexamples;

public class Member {
    private String name = "Joe";
    private Pair p = new Pair();

    {
        p.first = 4;
        p.second = 5;
        System.out.println(p);
    }

    public static void main(String[] args) {
        new Member();
    }

    private void printHello() {
        System.out.println("Hello " + name);
    }

    class Pair {
        int first;
        int second;

        Pair() {
            printHello();
        }

        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

}
