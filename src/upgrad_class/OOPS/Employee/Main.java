package upgrad_class.OOPS.Employee;

public class Main {
    public static void main(String[] args) {
      Employee employee=new Employee("Abhi",10000,1);
      HR hr=new HR(employee);
      hr.setEmployeeSalary(11111);
        System.out.println(employee.getSalary());
    }
}
