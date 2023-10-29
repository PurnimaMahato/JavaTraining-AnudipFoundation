package com.demo.test;
import java.util.Scanner;

class Calc{
	double num1 , num2 , num3 , avg;
	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter three number : ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
	
	}
	public void display() {
		avg = (num1 + num2 + num3 ) ;
		System.out.println("The result is : " + avg);
		
	}
}
public class Average {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Calc obj = new Calc();
		obj.accept();
		obj.display();
 
	}

}
