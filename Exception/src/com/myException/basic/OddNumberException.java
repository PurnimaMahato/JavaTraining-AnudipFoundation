//Q.1) Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

package com.myException.basic;
import java.util.Scanner;

public class OddNumberException {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner sc = new Scanner(System.in);
		// input an even number
		System.out.println("Enter a even number :-");
		n = sc.nextInt();
		
		try {
			// this code may throw an exception
			checkEvenNumber(n);
		    System.out.println(n + " is even.");
		    }
		catch (IllegalArgumentException e) {
		    System.out.println("Error: " + e.getMessage());
		    }
		finally { 
			System.out.println("Programcontinuesafterexceptionhandling."); 
			//ClosetheScannerinthefinallyblock 
			sc.close(); 
			}
		}
	
	//creating a method that takes an integer as a parameter and throws an exception if the number is odd	  
	public static void checkEvenNumber(int n) {
	    if (n % 2 != 0) {
	    	throw new IllegalArgumentException(n + " is odd.");
	    }
	  }
	}


