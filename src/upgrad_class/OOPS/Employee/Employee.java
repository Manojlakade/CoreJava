package upgrad_class.OOPS.Employee;

public class Employee {
    String name;
    private int salary;
    protected int employeeId;

    public Employee(String name, int salary, int employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
