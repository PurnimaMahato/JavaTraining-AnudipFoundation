//Q.2)WAP to implement InputMismatchException using java code.
package com.myException.basic;
import java.util.*;
public class InputMismatchExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read input from the user.
        Scanner sc = new Scanner(System.in);

        // Use a try-catch block to handle InputMismatchException.
        try {
            // Prompt the user to enter an integer value.
            System.out.println("Enter an integer value: ");

            // Read the integer value from the user.
            int number = sc.nextInt();

            // Print the integer value.
            System.out.println("The integer value you entered is: " + number);
        } catch (InputMismatchException e) {
            // Handle the InputMismatchException.
            System.out.println("Invalid input. Please enter an integer value.");
        }

        // Close the Scanner object.
        sc.close();
    

	}

}
