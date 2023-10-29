//Q.1)WAP to display Employee information(id,empname,salary,designation) using default and parameterized constructor.
package com.constructor.basics;

public class EmployeeDetailsMain {
	public static void main(String[] args) {
        // Creating an employee using the default constructor
		EmployeeDetails emp1 = new EmployeeDetails();
        emp1.displayEmployeeInfo();

        // Creating an employee using the parameterized constructor
        EmployeeDetails emp2 = new EmployeeDetails(101, "Purnima Mahato", 55000.0, "Manager");
        emp2.displayEmployeeInfo();
    }

}
