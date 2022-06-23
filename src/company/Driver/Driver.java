package company.Driver;

import company.Company;
import company.Department;
import company.Employee;
import company.Position;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        Employee employee = new Employee("1", "Tesfamichael", "A", "Adugna", "6789", LocalDate.now(), 10000);
        Position p1 = new Position("Software Engineer", "Developing software");
        p1.setEmployee(employee);
        Department department = new Department("Software Development", "Fairfield");
        department.addPosition(p1);
        Company company = new Company("TMSC");
        company.addDepartment(department);
        System.out.println(company.getSalary());
        System.out.println(company.getDepartmentList());

    }
}
