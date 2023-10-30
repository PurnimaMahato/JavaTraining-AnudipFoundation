package com.example;

public class Manager extends Employee {
	int salary;
	public Manager(int id, String name , int salary) {
		super(id, name);
		// TODO Auto-generated constructor stub
		
	}
	
	public void data() {
		System.out.println("Your id "+id);
		System.out.println("Your name "+name);
		System.out.println("Your salary "+this.salary);
	}
}
