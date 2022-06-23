package company;

import java.util.ArrayList;
import java.util.List;

public class Department {
    List<Position> postionList;
    private String name, location;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
        postionList = new ArrayList<>();
    }

    public void addPosition(Position position) {
        postionList.add(position);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public List<Position> getPostionList() {
        return postionList;
    }

    public double getSalary() {
        double sum = 0.0;
        for (Position p : postionList
        ) {
            sum += p.getSalary();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", postionList=" + postionList +
                '}';
    }
}
