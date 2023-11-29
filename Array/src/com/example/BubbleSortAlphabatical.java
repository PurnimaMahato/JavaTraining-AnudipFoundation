//Q.2)Write a Java program to sort an array of strings in alphabetical order using the Bubble sort algorithm. Also experiment by comparing the result using Arrays.sort() method of Java Library. Print the original array and the sorted array using the following command: System.out.println (Arrays.toString(arr));
package com.example;
import java.util.Arrays;

public class BubbleSortAlphabatical {

    // Function to perform Bubble Sort on an array of strings
    static void bubbleSort(String arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        String arr[] = {"Purnima", "Rahul", "Rini", "Souvik", "Deb" , "Aishik"};

        // Original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Sorting using Bubble Sort
        bubbleSort(arr);

        // Sorted array using Bubble Sort
        System.out.println("Sorted array using Bubble Sort: " + Arrays.toString(arr));

        // Create a copy of the original array for Arrays.sort() comparison
        String arrCopy[] = Arrays.copyOf(arr, arr.length);

        // Sorting using Arrays.sort()
        Arrays.sort(arrCopy);

        // Sorted array using Arrays.sort()
        System.out.println("Sorted array using Arrays.sort(): " + Arrays.toString(arrCopy));
    }
}

