package com.constructor.basics;

public class StudentTest {
    public static void main(String[] args) {
        // Creating a student using the default constructor
        Student student1 = new Student();
        student1.displayDetails();

        // Creating a student using the parameterized constructor
        Student student2 = new Student(1, "Purnima Mahato", 90, "7th sem");
        student2.displayDetails();
    }
}
