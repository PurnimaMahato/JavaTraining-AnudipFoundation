//Q.3)Write a Java program to remove all duplicate elements from a list using streams.
package com.example;
//Importing packages
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 8, 10, 18, 36, 1, 6, 8);

        // Remove all duplicate elements using streams
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List after removing duplicates: " + distinctNumbers);
    }
}

