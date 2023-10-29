package com.arrray.example;
import java.util.Scanner;

public class SortAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		int temp = 0;    
		Scanner sc = new Scanner(System.in);
		
		// taking user input for array
		System.out.println("Enter elements of the array:-- " );
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
        
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }  
        
        sc.close();

	}

}
