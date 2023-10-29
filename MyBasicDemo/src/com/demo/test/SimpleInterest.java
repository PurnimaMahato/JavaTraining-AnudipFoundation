package com.demo.test;
import java.util.Scanner;

class CalcInterest{
	float p , r=7.5f , t , I;
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("Enter the  principle amount :  ");
        p=sc.nextFloat();
        System.out.println("Enter the  time :  ");
        t=sc.nextFloat();
        sc.close();	
	}
	
	public void output() {
		I = (p*r*t)/100 ;
        System.out.println("The simple interest is = "+ I);	
	}
	 
}
public class SimpleInterest {
	public static void main(String args[])
    {
		CalcInterest obj = new CalcInterest();
		obj.input();
		obj.output();
    }

}
