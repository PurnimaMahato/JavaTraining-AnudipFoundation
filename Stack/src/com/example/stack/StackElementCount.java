//Q.2)Write a Java program to count all stack elements.
package com.example.stack;
//Importing Stack class
import java.util.Stack;
//Main class
public class StackElementCount {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push some elements onto the stack
        stack.push(10);
        stack.push(62);
        stack.push(32);
        stack.push(94);
        stack.push(15);

        // Count the elements in the stack
        int count = stack.size();
        //Printing number of element
        System.out.println("Number of elements in the stack: " + count);
    }
}
