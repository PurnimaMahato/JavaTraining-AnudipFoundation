package com.basic.conditions;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 , num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :  ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
      	if(num1>num2){
      			System.out.println(num1 + " is greatest . "); 
      		}
      	else
      		{
      			System.out.println(num2 + " is greatest . "); 
        
      		}


	}

}
