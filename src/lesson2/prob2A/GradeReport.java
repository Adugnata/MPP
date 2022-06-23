package lesson2.prob2A;

public class GradeReport {
    private String grade;
    private Student student;

    public GradeReport(Student student) {
        this.student = student;

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
