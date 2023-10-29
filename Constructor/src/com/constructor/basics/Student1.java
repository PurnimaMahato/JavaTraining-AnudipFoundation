package com.constructor.basics;

public class Student1{
    // Private attributes
    private String name;
    private int age;
    private String department;

    // Constructor that takes all three attributes as parameters
    public Student1(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for 'department'
    public String getDepartment() {
        return department;
    }

    // Setter method for 'department'
    public void setDepartment(String department) {
        this.department = department;
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student1 student1 = new Student1("John Doe", 20, "Computer Science");

        // Accessing and printing the attributes
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Department: " + student1.getDepartment());
    }
}