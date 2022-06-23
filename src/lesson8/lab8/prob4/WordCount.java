package lesson8.lab8.prob4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCount {
    public static int countWords(List<String> words, char c, char d, int len) {
        return (int) words.parallelStream()
                .filter(word -> check(word, c, d))
                //.filter(word->word.contains(String.valueOf(c)))
                //.filter(word->!word.contains(String.valueOf(d)))
                .filter(word -> word.length() == len)
                .count();
    }

    public static boolean check(String word, char c, char d) {
        return word.contains(String.valueOf(c)) && !word.contains(String.valueOf(d));
    }

    public static void main(String[] args) {
        System.out.println(countWords(new ArrayList<>(
                Arrays.asList("come", "code", "road", "coffee", "cast")), 'c', 'd', 6));
    }
}
