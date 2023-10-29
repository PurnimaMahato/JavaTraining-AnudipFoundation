//Wap to accept 5 numbers from user and find 2nd largest from that array list
package com.arrray.example;

import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// taking user input for 1st array
		System.out.println("Enter elements of the array:-- " );
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		// sorting the array in ascending order
		Arrays.sort(arr);
		int SecondLargest = arr[arr.length-2];
		System.out.println("The second largest number of the array is- " + SecondLargest );
		sc.close();

	}

}
