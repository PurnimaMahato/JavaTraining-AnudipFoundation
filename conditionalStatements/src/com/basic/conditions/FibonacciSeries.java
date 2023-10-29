package com.basic.conditions;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1=0,t2=1,t3,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count upto which fibonacci series you want to print:");
		count=sc.nextInt();
		System.out.print("Fibonacci Series is "+t1+" "+t2);
		
		for(int i=3;i<=count;i++)
		{
			t3=t1+t2;
			t1=t2;
			t2=t3;
			System.out.print(" "+t3);
		}

	}

}
