package lesson7.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format
        list.forEach((e) -> System.out.println(e.toUpperCase()));

        System.out.println();

        //implement a Consumer
        Consumer<String> exp = (e) -> System.out.println(e.toUpperCase());
        list.forEach(exp);

    }
}