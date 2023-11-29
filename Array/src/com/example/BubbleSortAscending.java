//Q.1)Write a Java program to sort an array of integers in ascending order using the Bubble sort algorithm. Also experiment by comparing the result using Arrays.sort() method of Java Library. Print the original array and the sorted array using the following command: System.out.println (Arrays.toString(arr));
package com.example;

import java.util.Arrays;

public class BubbleSortAscending {

    // Function to perform Bubble Sort
    static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {12, 22, 11, 90,64, 34, 25, 123};

        // Original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sorting using Bubble Sort
        bubbleSort(arr);

        // Sorted array using Bubble Sort
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(arr));

        // Create a copy of the original array for Arrays.sort() comparison
        int arrCopy[] = Arrays.copyOf(arr, arr.length);

        // Sorting using Arrays.sort()
        Arrays.sort(arrCopy);

        // Sorted array using Arrays.sort()
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arrCopy));
    }
}
