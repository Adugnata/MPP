package company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Department> departmentList;
    private String name;

    public Company(String name) {
        this.name = name;
        departmentList = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public double getSalary() {
        double sum = 0.0;
        for (Department d : departmentList)
            sum += d.getSalary();
        return sum;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departmentList=" + departmentList +
                '}';
    }
}
