//Q.2)Implement stack using Stack class(insert elements as name of the animal)
package com.example.stack;
import java.util.Stack;

public class AnimalStackExample {
    public static void main(String[] args) {
        Stack<String> animalStack = new Stack<>();

        // Pushing animal names onto the stack
        animalStack.push("Lion");
        animalStack.push("Elephant");
        animalStack.push("Tiger");
        animalStack.push("Giraffe");
        animalStack.push("Zebra");

        System.out.println("Stack Contents:");

        // Popping and printing the elements from the stack
        while (!animalStack.isEmpty()) {
            String animal = animalStack.pop();
            System.out.println(animal);
        }
    }
}
