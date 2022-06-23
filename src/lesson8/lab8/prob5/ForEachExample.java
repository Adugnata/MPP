package lesson8.lab8.prob5;

import java.util.Arrays;
import java.util.List;


public class ForEachExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        /**
         * a. Use a lambda expression instead of directly defining a Consumer
         */
        list.forEach((e) -> System.out.println(e.toUpperCase()));

        System.out.println();

        /**
         * b. Use a method reference in place of your lambda expression in (a)
         */
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}