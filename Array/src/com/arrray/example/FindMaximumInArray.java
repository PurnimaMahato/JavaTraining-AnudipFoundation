package com.arrray.example;

public class FindMaximumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {25, 11, 7, 75, 56};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    

	}

}
