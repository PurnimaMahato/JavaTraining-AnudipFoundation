package com.constructor.basics;

public class Employee {
	int id;
	String name;
	int Empid;
// Empty no-argument constructor
	public Employee() {
		this.id = 0;
		this.name = "Not Avalable";
	}
	// Overloaded constructor with parameter id(int)
	public Employee(int id) {
		this.id = id;
		this.name = "Not Avalable";
	}
	// Overloaded constructor with id and name parameter 
		public Employee(int id , String name) {
			this.id = id;
			this.name = name;
		}
		public void display() {
			System.out.println("employee Info:");
			System.out.println("ID: "+ this.id);
			System.out.println("Name: "+ this.name);
		}
		//Main method to test the Employee class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling empty constructor
		Employee e1 = new Employee();
		e1.display();
		//Calling one parameter constructor
		Employee e2 = new Employee(15);
		e2.display();
		//Calling two parameter constructor
		Employee e3 = new Employee(11, "Purnima Mahato");
		e3.display();
	
	}

}
