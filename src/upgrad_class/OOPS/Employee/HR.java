package upgrad_class.OOPS.Employee;

public class HR {
    Employee obj;

    HR(Employee obj){
        System.out.println(obj.name);
        System.out.println(obj.employeeId);
        System.out.println(obj.getSalary());
        this.obj=obj;
    }
    public void setEmployeeSalary(int updatedSalary){
        obj.setSalary(updatedSalary);
    }




}
