package tsol.lab2.prob2A;

public class GradeReport implements Comparable<GradeReport> {
    private Student student;
    private String grade;

    //package level access
    GradeReport(Student st) {
        student = st;
    }

    public Student getStudent() {
        return student;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String g) {
        grade = g;
    }

    @Override
    public int compareTo(GradeReport o) {
        return grade.compareTo(o.grade);
    }

    @Override
    public String toString() {
        return grade;
    }
}
