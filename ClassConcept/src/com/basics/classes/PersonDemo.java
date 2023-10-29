package com.basics.classes;
import java.util.Scanner;
class Person{  // Blueprint to describe an object .
	double h , w ;
	Scanner sc = new Scanner(System.in);
	public void access() {
		System.out.println("Enter your height : ");
		h = sc.nextDouble();
		System.out.println("Enter your weight : ");
		w = sc.nextDouble();
	}
	public void display() {
		System.out.println("Your height is "+h+" feet and weight is "+w + " kg");
	}
	
	
}
public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		obj.access();
		obj.display();
		
		

	}

}
