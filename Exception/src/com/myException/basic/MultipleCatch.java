//Q.2)WAP to implement multiple catch in java program

package com.myException.basic;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// this code may throw an exception
			int a[] = new int[5]; // array initialization
			a[5] = 30/0;
		}
		catch(ArithmeticException e)
		{
			// gives an Arithmetic Exception error
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			// gives an Array IndexOutOfBounds Exception error
			System.out.println("Array IndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
			// gives a parent Exception error
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code.........");

	}

}
