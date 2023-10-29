//Q.1)WAP to accept a value from user and throw an exception if it is equal to zero.
package com.myException.basic;

public class ZeroException {
	//function to check if the number is zero or not 
	public void check(int num) {
		if(num==0) {
			//throw Arithmetic exception if the input is zero
			throw new ArithmeticException("Zero input is not allowed .");
		}
		else {
			System.out.println("It is a non zero value.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroException obj = new ZeroException();
		obj.check(12);// calling the method
		System.out.println("Rest of the code.....");
	
	}

}
