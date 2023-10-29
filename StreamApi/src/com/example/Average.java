//Q.1)Write a Java program to calculate the average of a list of integers using streams.
package com.example;
//importing packages
import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 8, 10, 18, 36); // list of numbers

        // Calculate the average using streams
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average value of the said numbers: " + average);
    }
}
