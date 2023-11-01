//Q.2)WAP to create Node in LinkedList.
package com.example;
//Define a Node class for a singly linked list
class Node {
 // Data stored in the node
 int data;

 // Reference to the next node
 Node next;

 // Constructor to create a new Node with data
 Node(int data) {
     this.data = data;
     this.next = null; // By default, the next reference is null
 }
}

public class NodeCreationExample {
 public static void main(String[] args) {
     // Creating nodes
     Node firstNode = new Node(10);
     Node secondNode = new Node(20);
     Node thirdNode = new Node(30);

     // Connecting nodes to create a linked list
     firstNode.next = secondNode; // Link the first node to the second node
     secondNode.next = thirdNode; // Link the second node to the third node

     // Traversing and printing the linked list
     Node current = firstNode; // Start from the first node

     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next; // Move to the next node
     }

     System.out.println("null"); // End of the linked list
 }
}
