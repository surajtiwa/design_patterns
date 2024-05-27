package designPatterns.structural.Adapter;

/**
 * An object adapter. Using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer {
   private Employee employee;//object of the class which need adapting


    EmployeeObjectAdapter(Employee employee){
        this.employee=employee;
    }
    @Override
    public String getName() {
        return employee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employee.getOfficeLocation();
    }

   /* public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }*/
}
