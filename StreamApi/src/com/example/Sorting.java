//Q.2)Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
package com.example;
//importing packages
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Purnima", "Rahul", "Neeraj", "Deb", "Mrinmoyee");

        // Sort strings in ascending order
        List<String> ascendingOrder = names.stream()
                .sorted()
                .collect(Collectors.toList());

        // Sort strings in descending order
        List<String> descendingOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        System.out.println("Sorted in ascending order: " + ascendingOrder);
        System.out.println("Sorted in descending order: " + descendingOrder);
    }
}
