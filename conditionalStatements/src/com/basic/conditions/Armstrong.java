package com.basic.conditions;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , temp, p = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		n=sc.nextInt(); // taking user input
		temp = n;
		while (n > 0) {
            int rem = n % 10;
            p += (rem * rem * rem);
            n /= 10;
        }
 
        // Condition to check whether the value
        // of P equals to user input or not.
        if (temp == p) {
            System.out.println("Yes. It is Armstrong No.");
        }
        else {
            System.out.println("No. It is not an Armstrong No.");
        }
		
	}

}
