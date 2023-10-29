package com.basic.conditions;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt(); // taking user input
		
		if((num%2)==0) {
			System.out.println(num + " is a even number .");
		}
		else {
			System.out.println(num + " is a odd number .");
		}

	}

}
