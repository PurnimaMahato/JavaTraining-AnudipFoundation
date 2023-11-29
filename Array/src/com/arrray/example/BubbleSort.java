package com.arrray.example;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5 , i , j, x;
		int[] array = new int[n];
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter 5 elements in random order: ");
		for(i=0;i<n;i++) {
			array[i] = s.nextInt();
		}
		
		for(i=0;i<(n-1);i++) {
			for(j=0;j<(n-i-1);j++) {
				if(array[j]>array[j+1]) {
					x = array[i];
					array[j] = array[j+1];
					array[j+1] = x;
					
				}
			}
		}
		System.out.println("The new sorted array is:");
		for(i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
