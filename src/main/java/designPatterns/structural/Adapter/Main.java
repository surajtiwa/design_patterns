package designPatterns.structural.Adapter;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        /** Using Class/Two-way adapter **/
        BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();
        EmployeeClassAdapter customer = new EmployeeClassAdapter();
        populateEmployeeData(customer);//using Adapter where Adaptee is expected
        String card = businessCardDesigner.designCard(customer);//Using Adapter where target Interface was intended
        System.out.println(card);
        System.out.println("***********************");
        /** Using Object Adapter **/
        Employee emp = new Employee();//create Adaptee object
        populateEmployeeData(emp);
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(emp);//Added the object into Adapter
        String cardUsingObjectAdapter = businessCardDesigner.designCard(employeeObjectAdapter);//Using Adapter where target Interface was intended
        System.out.println(cardUsingObjectAdapter);


    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}
