//create product table(pid,pname,pcost) and take data from java application to add product details.
package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyJDBC {

	public static void main(String[] args) throws ClassNotFoundException , SQLException {
		// TODO Auto-generated method stub
		//step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductDetails","root","Bhabani_Nilima@2002");
		
		//step 3
		PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
		
		//step 4 
		//scanning details of product
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter product id:");
		int pid = sc.nextInt();
		System.out.println("Enter product name:");
		String pname = sc.next();
		System.out.println("Enter product cost:");
		int pcost = sc.nextInt();
		
		//setting the data
		pstmt.setInt(1, pid);
		pstmt.setString(2, pname);
		pstmt.setInt(3, pcost);
		
		//table updation message
		int r = pstmt.executeUpdate();
		con.close();
		sc.close();
		System.out.println(r+" record added successfully....");
		
		
		
		
		
		
	}

}
