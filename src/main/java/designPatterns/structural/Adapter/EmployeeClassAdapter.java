package designPatterns.structural.Adapter;

/**
 * A class adapter, works as Two-way adapter we are extending from our Adaptee Employee and implemnting our target Customer
 */
public class EmployeeClassAdapter extends Employee implements  Customer{

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
