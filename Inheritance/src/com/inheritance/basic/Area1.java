package com.inheritance.basic;

import java.util.Scanner;
class UserInput
{
	public int radius,len,breadth,side,area; //variable declaration
	Scanner sc=new Scanner(System.in);
	public void accept() 
	{
		System.out.println("Enter length and breadth of rectangle: ");
		len=sc.nextInt();
		breadth=sc.nextInt();
		System.out.println("Enter the radius: ");
		radius=sc.nextInt();
		System.out.println("Enter the side: ");
		side=sc.nextInt();		
	}
public void areaRect() 
{
	area=len*breadth;
	System.out.println("The area of rectangle is: "+area);
}

}
//inheritance of class UsetInput
class Circle extends UserInput
{
	public double areaCircle,areaSquare;
	public void calCirc()
	{
		areaCircle=3.14*radius*radius;
		System.out.println("Area of Circle: "+areaCircle);
	}
	public void areaSq()
	{
		areaSquare=side*side;
		System.out.println("Area of square: "+areaSquare);
	}
}
//inheritance of class Circle
public class Area1  extends Circle{
    public static void main(String[] args){
    	// TODO Auto-generated method stub    	
Circle obj=new Circle();//creating object
obj.accept();
obj.areaRect();
obj.calCirc();
obj.areaSq();
    }
    
}