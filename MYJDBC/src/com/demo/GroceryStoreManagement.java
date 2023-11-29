//Create database for your projecttopic and perform insert operation on main Entity through jdbc
//Topic - Grocery Management System
package com.demo;
//importing some java.sql classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GroceryStoreManagement {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery_store_manage","root","Bhabani_Nilima@2002");
		
		//step 3
		PreparedStatement pstmt = con.prepareStatement("insert into grocery_items values(?,?,?,?,?)");
		
		//step 4 
		//scanning details of product

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter item's id:");
		int id = sc.nextInt();
		System.out.println("Enter item's name:");
		String Name = sc.next();
		System.out.println("Enter item's BrandName:");
		String BrandName = sc.next();
		System.out.println("Enter item's cost per pack:");
		int Cost = sc.nextInt();
		System.out.println("Enter item's expairy date:");
		String Exp_date = sc.next();
		
		
		//using set method
		pstmt.setInt(1, id);
		pstmt.setString(2, Name);
		pstmt.setString(3, BrandName);
		pstmt.setInt(4, Cost);
		pstmt.setString(5, Exp_date);
		
		
		//table updation message
		int r = pstmt.executeUpdate();
		System.out.println(r+" record added successfully....");	
		
		//closing
		con.close();
		sc.close();
		
	}

}
