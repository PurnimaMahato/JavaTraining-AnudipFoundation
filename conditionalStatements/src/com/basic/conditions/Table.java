package com.basic.conditions;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt(); // taking user input

		System.out.println("Table of "+num);
		for(i=1;i<=10;i++) 
			{
				System.out.println(+num+" * "+i+" = "+num*i);
			}	

	}

}
