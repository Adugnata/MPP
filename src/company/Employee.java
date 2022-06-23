package company;

import java.time.LocalDate;

public class Employee {
    private String employeeId, firstname, middleInitial, lastName, SSN;
    private LocalDate birthDate;
    private double salary;

    public Employee(String employeeId, String firstname, String middleInitial, String lastName, String SSN, LocalDate birthDate, double salary) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.SSN = SSN;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SSN='" + SSN + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}
