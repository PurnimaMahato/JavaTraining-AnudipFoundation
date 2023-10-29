package com.inheritance.basic;

class Animal {	//creating a superclass called Animal 
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {		//subclass of Animal called Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal { 		////subclass of Animal called cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) { 	// main method
        Animal animal = new Animal(); // creating object of Animal class
        animal.makeSound();

        Dog dog = new Dog();	// creating object of Dog class
        dog.makeSound();

        Cat cat = new Cat();	// creating object of Cat class
        cat.makeSound();
    }
}