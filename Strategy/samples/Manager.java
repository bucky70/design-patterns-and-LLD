package Strategy.samples;

public interface Employee {
    void work();
}

public class Developer implements Employee {
    @Override
    public void work() {
        System.out.println("Developer is working");
    }
}

public class Manager {
    private Employee employee;

    public Manager(Employee employee) {
        this.employee = employee;
    }

    public void work() {
        employee.work();
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}