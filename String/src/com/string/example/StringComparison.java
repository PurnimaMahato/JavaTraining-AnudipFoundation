//Q.1) WAP to compare two strings(take user input).

package com.string.example;
import java.util.Scanner;// importing scanner class
//Main class
public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the first string
        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();

        // Taking user input for the second string
        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();

        // Comparing the two strings
        if (firstString.equals(secondString)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // Closing the scanner
        sc.close();//closing scanner class
    }
}
