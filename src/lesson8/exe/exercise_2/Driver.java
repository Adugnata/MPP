package lesson8.exe.exercise_2;

import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        MyIface mrg = () -> (new Random()).nextInt();
        System.out.println(mrg.produce());
    }
}
