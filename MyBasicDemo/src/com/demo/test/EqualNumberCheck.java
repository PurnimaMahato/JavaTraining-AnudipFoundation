//Q.1)Write a program to check if the two numbers 23 and 45 are equal.(take user input)
package com.demo.test;
import java.util.Scanner;
public class EqualNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class object
		System.out.println("Enter two number :-");
		//taking user input
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//checking the numbers are equal or not .
		if(num1==num2) {
			System.out.println("The numbers are equal .");
		}
		else {
			System.out.println("The numbers are not equal .");
		}
		sc.close();//closing scanner class object .

	}

}
