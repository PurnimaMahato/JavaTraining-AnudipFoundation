//Q.1)WAP to display Employee information(id,empname,salary,designation) using default and parameterized constructor.
package com.constructor.basics;

public class EmployeeDetails {
	 int id;
     String empName;
     double salary;
     String designation;

    // Default constructor
    public EmployeeDetails() {
        id = 0;
        empName = "N/A";
        salary = 0.0;
        designation = "N/A";
    }

    // Parameterized constructor
    public EmployeeDetails(int id, String empName, double salary, String designation) {
    	super();
        this.id = id;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
    }

    public void displayEmployeeInfo() {
    	//Printing the employee details
        System.out.println("Employee Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println("-----------------------------------------------------------------");
    }
}


