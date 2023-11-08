//Q.2)WAP to show the PriorityQueue implementation.
package com.queue.example;
//import Priority queue class
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(15);

        // Display the contents of the priority queue
        System.out.println("Priority Queue: " + priorityQueue);

        // Remove the first element using peek()
        int peekedElement = priorityQueue.peek();
        System.out.println("Element peeked: " + peekedElement);
        System.out.println("Priority Queue after peek(): " + priorityQueue);

        // Remove the first element using remove()
        int removedElement = priorityQueue.remove();
        System.out.println("Element removed: " + removedElement);
        System.out.println("Priority Queue after remove(): " + priorityQueue);

        // Add more elements to the priority queue
        priorityQueue.add(3);
        priorityQueue.add(8);

        // Display the contents of the priority queue
        System.out.println("Priority Queue: " + priorityQueue);

        // Check if the priority queue contains an element
        boolean containsElement = priorityQueue.contains(15);
        System.out.println("Does the priority queue contain 15? : " + containsElement);

        // Clear the priority queue
        priorityQueue.clear();

        // Check if the priority queue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is the priority queue empty? : " + isEmpty);

    
    }
}
