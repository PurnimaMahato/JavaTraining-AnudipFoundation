package com.example;

public class Employee{
	int id;
	String name ;
	public Employee(int id , String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Your id is "+id+" and name is "+name);
	}

	

}
