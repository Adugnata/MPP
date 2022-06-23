package lesson9.exer.exercise_4;

import java.util.stream.Stream;

public class Main {
    //Use the reduce method to produce a single space-separated String
    public static void main(String[] args) {

        Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        String s = (String) strings.reduce("", (x, y) -> x + " " + y);
        System.out.println(s);

    }

}
