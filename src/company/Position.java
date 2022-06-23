package company;

public class Position {
    private String title, description;
    private Employee employee;

    public Position(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return employee.getSalary();
    }

    @Override
    public String toString() {
        return "Postion{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                '}';
    }
}
