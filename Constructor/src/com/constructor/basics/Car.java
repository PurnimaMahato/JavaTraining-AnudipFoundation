package com.constructor.basics;

public class Car {
     String brand;
     String color;
     double price;
    // Empty no-argument constructor
    public Car() {
    	this.brand = "Not Avalable";
        this.color = "Not Avalable";
        this.price = 0;
    }
    // Overloaded constructor with two parameter
    public Car(String brand, double price) {
        this.brand = brand;
        this.color = "Not Avalable";
        this.price = price;
    }
    // Overloaded constructor with three parameter
    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // Method overloading
    public void printCarDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
    }

  
    // main method
    public static void main(String[] args) {
        // Create three Car objects
        Car car1 = new Car();
        Car car2 = new Car("BMW", 200000);
        Car car3 = new Car("Honda", "White", 300000);

        // Print car details using overloaded methods
        car1.printCarDetails();
        car2.printCarDetails();
        car3.printCarDetails();
    }
}