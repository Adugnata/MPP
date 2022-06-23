package lesson2.prob2A;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student[]{
                new Student("Bob"),
                new Student("Tom")
        });
        students.forEach((s) -> s.getGradeReport().setGrade(String.valueOf(Grade.A)));
        for (Student s : students)
            System.out.println(s.getName() + " has got " + s.getGradeReport().getGrade());
    }
}
