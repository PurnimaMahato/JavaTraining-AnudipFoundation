// Q.2.2)Program to swap the values of the two variables without using a third variable .
package com.demo.test;
import java.util.Scanner;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class object
		//taking user input
		System.out.println("Enter the value of a :-");
		int a = sc.nextInt();
		System.out.println("Enter the value of b :-");
		int b = sc.nextInt();
		System.out.println("Before swapping the value of a is "+ a +" and the value of b is " + b +" . ");
		//swapping without using third variable
		a = a + b ;
		b = a - b ;
		a = a - b ;
		System.out.println("After swapping the value of a is "+ a +" and the value of b is " + b +" . ");
		sc.close();//closing scanner class object

	}

}
