//Q.2)WAP to find length of the string and reverse given string given by user.
package com.string.example;
import java.util.Scanner; // importing scanner class
//Main class
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // Find the length of the string
        int length = str.length();

        // Reverse the string
        String reversedString = "";
        for (int i = length - 1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        // Print the length and reversed string
        System.out.println("The length of the string is: " + length);
        System.out.println("The reversed string is: " + reversedString);
        sc.close();//closing scanner class
    }
}