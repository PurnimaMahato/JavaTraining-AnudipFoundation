package com.example;

public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ******how normal interface works***** 
		 Shape obj = new Rectangle2();
		 obj.draw():
		  */
		Shape rectangle=()->System.out.println("You are drawing rectangle");
		rectangle.draw();
	}

}
