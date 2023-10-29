package com.constructor.basics;

public class OverloadingTest1 {
	void addition (int a,int b) {
		int sum=a+b;
		System.out.println("sum of two number is: " +sum);
		
	}
//	addition method of parameter a,b,and c
	void addition(int a, int b, int c) {
		int sum= a+b+c;
		System.out.println("Sum of three number is :" +sum);
	}
	
	void addition(int a, double b, double c) {
		double sum= a+b+c;
		System.out.println("Sum of three number is :" +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingTest1 ovl= new OverloadingTest1();
		ovl.addition(2, 4);
		ovl.addition(2,4,6);
		ovl.addition(2, 45.2,4.3);

	}

}
