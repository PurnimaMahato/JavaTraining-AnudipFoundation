//Q.1)Write a Java program to implement a stack using a linked list.Insert Element of type string(name of the fruits)
package com.example.stack;
class Node {
    String data; // Data of the node
    Node next;   // Reference to the next node

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack {
    private Node top; // Reference to the top of the stack

    LinkedListStack() {
        top = null;
    }

    // Push operation to insert an element at the top of the stack
    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation to remove and return the element from the top of the stack
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        String data = top.data;
        top = top.next;
        return data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        // Pushing fruit names onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Mango");
        stack.push("Strawberry");

        System.out.println("Stack Contents:");

        // Popping and printing the elements from the stack
        while (!stack.isEmpty()) {
            String fruit = stack.pop();
            System.out.println(fruit);
        }
    }
}
