package com.example;

class Rectangle implements Drawable{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
//Using interface :by third user
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d = new Circle (); // In real scenario , object is provided by method e.g. getDrawable()
		d.draw();
	}

}
