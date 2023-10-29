package com.constructor.basics;

class Student {
     int rollNo;
     String name;
     double percentage;
     String std;

    // Default constructor
    public Student() {
        rollNo = 0;
        name = "";
        percentage = 0.0;
        std = "";
    }

    // Parameterized constructor
    public Student(int rollNo, String name, double percentage, String std) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        this.std = std;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Standard: " + std);
        System.out.println("-----------------------------------------------------------------");
    }
}

