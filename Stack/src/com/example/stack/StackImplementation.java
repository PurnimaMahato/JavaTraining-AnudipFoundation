//Q.1)Write a Java program that implements a stack and creates a new stack that contains all elements from two stacks without duplicates.
package com.example.stack;

public class StackImplementation {
  private int[] arr;
  private int top;

  // Constructor to initialize the stack
  public StackImplementation(int size) {
    arr = new int[size];
    top = -1;
  }

  // Method to push an element onto the stack
  public void push(int num) {
    if (top == arr.length - 1) {
      System.out.println("Stack is full");
    } else {
      top++;
      arr[top] = num;
    }
  }

  // Method to pop an element from the stack
  public int pop() {
    if (top == -1) {
      System.out.println("Stack Underflow");
      return -1;
    } else {
      int poppedElement = arr[top];
      top--;
      return poppedElement;
    }
  }

  // Method to get the top element of the stack
  public int peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -1;
    } else {
      return arr[top];
    }
  }

  // Method to check if the stack is empty
  public boolean isEmpty() {
    return top == -1;
  }

  // Method to get the size of the stack
  public int getSize() {
    return top + 1;
  }

  public static StackImplementation findUniqueElements(StackImplementation stack1, StackImplementation stack2) {
	  StackImplementation resultStack = new StackImplementation(stack1.arr.length + stack2.arr.length);

    // Add all elements from stack1 to resultStack
    for (int i = 0; i <= stack1.top; i++) {
      int element = stack1.arr[i];
      if (!resultStack.contains(element)) {
        resultStack.push(element);
      }
    }

    // Add all elements from stack2 to resultStack
    for (int i = 0; i <= stack2.top; i++) {
      int element = stack2.arr[i];
      if (!resultStack.contains(element)) {
        resultStack.push(element);
      }
    }

    return resultStack;
  }

  // Helper method to check if a stack contains an element
  private boolean contains(int element) {
    for (int i = 0; i <= top; i++) {
      if (arr[i] == element) {
        return true;
      }
    }
    return false;
  }

  // Method to display the elements of the stack
  public void display() {
    if (top == -1) {
      System.out.println("Stack is empty!");
    } else {
      System.out.print("Stack elements: ");
      for (int i = top; i >= 0; i--) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
	// Create object for StackImplementation class
	StackImplementation result = new StackImplementation(5);
	//create object for every stack and Pushing elements in all stack and display them
	StackImplementation stack1 = new StackImplementation(5);
    stack1.push(1);
    stack1.push(2);
    stack1.push(3);
    System.out.println("Stack-1");
    stack1.display();
    StackImplementation stack2 = new StackImplementation(5);
    stack2.push(3);
    stack2.push(5);
    stack2.push(6);
    System.out.println("Stack-2");
    stack2.display();
    StackImplementation stack3 = new StackImplementation(5);
    stack3.push(1);
    stack3.push(2);
    stack3.push(4);
    System.out.println("Stack-3");
    stack3.display();
    // finding and displaying unique elements
    System.out.println("New stack that contains all elements from two stacks (stack1, stack2) without duplicates:");
    result = findUniqueElements(stack1, stack2);
    result.display();
    System.out.println("New stack that contains all elements from two stacks (stack1, stack3) without duplicates:");
    result = findUniqueElements(stack1, stack3);
    result.display();
    System.out.println("New stack that contains all elements from two stacks (stack3, stack2) without duplicates:");
    result = findUniqueElements(stack3, stack2);
    result.display();
  }
}