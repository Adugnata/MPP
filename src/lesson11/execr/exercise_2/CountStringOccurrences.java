package lesson11.execr.exercise_2;

public class CountStringOccurrences {
    public static <T> int countOccurrences(T[] arr, T target) {
        int count = 0;
        if (target == null) {
            for (T item : arr) {
                if (item == null) {
                    count++;
                }
            }
        } else {
            for (T item : arr) {
                if (target.equals(item)) {
                    count++;
                }
            }
        }
        return count;
    }
}
