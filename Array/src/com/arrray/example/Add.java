package com.arrray.example;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[5];
		int []b = new int[5];
		int []c = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// taking user input for 1st array
		System.out.println("Enter elements of 1st mattrix:-- " );
		for(int i=0 ; i<5 ; i++) {
			a[i] = sc.nextInt();
		}
		// taking user input for 1st array
		System.out.println("Enter elements of 1st mattrix:-- " );
		for(int i=0 ; i<5 ; i++) {
			b[i] = sc.nextInt();
		}
		// adding two matrix
		for(int i=0 ; i<5 ; i++) {
			c[i] = a[i]+b[i];
		}
		// Output of summation
		System.out.println("The sum of the two matrices is :-" );
		for(int i=0 ; i<5 ; i++) {
			System.out.print(c[i] +" ");	
		}
		 sc.close();

	}

}
