package com.arrray.example;
import java.util.Scanner;
public class TwodArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Create two 2x2 arrays using wrapper class
	        Integer[][] array1 = new Integer[2][2];
	        Integer[][] array2 = new Integer[2][2];

	        // Take user input for the first array
	        System.out.println("Enter the elements of the first array:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                array1[i][j] = sc.nextInt();
	            }
	        }

	        // Take user input for the second array
	        System.out.println("Enter the elements of the second array:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                array2[i][j] = sc.nextInt();
	            }
	        }

	        // Add the two arrays
	        // Create a 2x2 array using wrapper class
	        Integer[][] sumArray = new Integer[2][2];
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                sumArray[i][j] = array1[i][j] + array2[i][j];
	            }
	        }

	        // Print the sum array
	        System.out.println("The sum of the two arrays is:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(sumArray[i][j] + " ");
	            }
	            System.out.println();
	        }
	      sc.close();

	}

}
