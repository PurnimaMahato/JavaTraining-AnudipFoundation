package com.basic.conditions;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char op ;
		double num1 , num2 , res ;
		System.out.println("Enter which operation you want to perform ____ + , - , * , / , %:");
		op = sc.next().charAt(0);
		System.out.println("Enter two number .");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		
		switch(op) {
		// performs addition between numbers
		case '+':
			res = num1 + num2 ;
			System.out.println(num1+" + "+num2+" = "+res);
			break;
			
		// performs subtraction between numbers
		case '-':
			res = num1 - num2 ;
			System.out.println(num1+" - "+num2+" = "+res);
			break;
			
		// performs multiplication between numbers	
		case '*':
			res = num1 * num2 ;
			System.out.println(num1+" * "+num2+" = "+res);
			break;
			
		// performs division between numbers
		case '/':
			res = num1 / num2 ;
			System.out.println(num1+" / "+num2+" = "+res);
			break;
			
		// performs modulus between numbers
		case '%':
			res = num1 % num2 ;
			System.out.println(num1+" % "+num2+" = "+res);
			break;
			
		default:
			System.out.println("Invalid choice ."); 
			break;
		}
		
		sc.close();
		

	}

}
