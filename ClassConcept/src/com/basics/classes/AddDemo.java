package com.basics.classes;
import java.util.Scanner;
class Add{
	Scanner sc = new Scanner(System.in);
	int num1 , num2 , ans ;
	
	public void accept()
	{
		System.out.println("Enter two number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	
	}
	public void display(int num1 , int num2) {
		ans = num1 + num2 ;
		System.out.println("The result is : " + ans);
		
	}
}
public class AddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add obj = new Add();
		obj.accept();
		obj.display(obj.num1, obj.num2);

	}

}
