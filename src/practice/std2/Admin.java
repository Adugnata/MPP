package practice.std2;

public class Admin {
    //implement
    Department[] departments; // = new Department[3];

    public Admin(Department[] depts) {
        departments = depts;
    }

    public String hourlyCompanyMessage() {
        StringBuilder sb = new StringBuilder();
        for (Department dept : departments) {
            String name = dept.getName();
            String msg = dept.nextMessage();
            sb.append(format(name, msg) + "\n");
        }
        return sb.toString();
    }

    public String format(String name, String msg) {
        return name + ": " + msg;
    }

}
